package com.example.servingwebcontent.web;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class ColorsController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping(value="/greeting-aaron")
    public String greetingAaron() {return "greetingAaron";}

    @GetMapping(value="/greeting-l")
    public String greetingL() {return "greetingL";}

    @GetMapping(value="/red")
    public String color() {
        return "red";
    }

    @GetMapping(value="/colors")
    public String colorsForm(Model model) {
        model.addAttribute("color", new Color(""));
        List<String> listOfColors = Arrays.asList("red", "green", "orange", "blue");
        model.addAttribute("listOfColors", listOfColors);
        return "color";
    }

    @PostMapping(value = "/colors")
    public String colorsSubmit(@ModelAttribute("color") Color color){
//        model.addAttribute("color", color);
        System.out.println("Received request, color is: "+ color.getColorName() + " and complement is " + color.getComplement());
        return "result";
    }
}
