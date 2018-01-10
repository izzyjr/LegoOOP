package com.israelmesa;

public class Woman {
    private String name;
    private MovingThings movingThings;

    public Woman(String name, MovingThings movingThings) {
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
