package com.israelmesa;

public class Human extends GeneralObject{
    private String name;

    public Human(boolean move, String color, String name) {
        super(move, color);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
