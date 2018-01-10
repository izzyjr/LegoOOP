package com.israelmesa;

public class MovingThings {

        private String color;
        private boolean move;

    public MovingThings(String color, boolean move) {
        this.color = color;
        this.move = move;
    }

    public String getColor() {
        return color;
    }

    public boolean isMove() {
        return move;
    }
}
