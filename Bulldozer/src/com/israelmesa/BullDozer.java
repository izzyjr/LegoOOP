package com.israelmesa;

public class BullDozer {
    private String Color;
    private String Size;

    public BullDozer(String color, String size) {
        Color = color;
        Size = size;
    }

    public String getColor() {
        return Color;
    }

    public String getSize() {
        return Size;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setSize(String size) {
        Size = size;
    }
}
