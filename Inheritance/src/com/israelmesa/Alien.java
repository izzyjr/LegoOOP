package com.israelmesa;

public class Alien extends GeneralObject{
    private String planet;

    public Alien(boolean move, String color, String planet) {
        super(move, color);
        this.planet = planet;
    }

    public String getPlanet() {
        return planet;
    }
}
