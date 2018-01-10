package com.israelmesa;

public class Man {
    private String name;
    MovingThings movingThings;

    public Man(String name, MovingThings movingThings) {
        this.name = name;
        this.movingThings = movingThings;
    }

    public String getName() {
        return name;
    }

    public MovingThings getMovingThings() {
        return movingThings;
    }
}
