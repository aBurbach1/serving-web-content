package com.example.servingwebcontent.web;

public class Color {
    private String colorName;
    private String complement;

    public Color(String colorName) {
        this.colorName = colorName;
        switch (this.colorName) {
            case "red":
                this.complement = "green";
                break;
            case "blue":
                this.complement = "orange";
                break;
            case "orange":
                this.complement = "blue";
                break;
            case "green":
                this.complement = "red";
                break;
            default:
                this.complement = "black";
                break;
        }
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
