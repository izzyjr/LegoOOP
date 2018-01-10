package com.israelmesa;

public class GeneralObject {
    private boolean move;
    private String color;

    public GeneralObject(boolean move, String color) {
        this.move = move;
        this.color = color;
    }

    public boolean isMove() {
        return move;
    }

    public String getColor() {
        return color;
    }
}
