package com.israelmesa;

public class Alien extends MovingThings {
    private String planet;

    public Alien(String color, boolean move, String planet) {
        super(color, move);
        this.planet = planet;
    }

    public String getPlanet() {
        return planet;
    }
}
