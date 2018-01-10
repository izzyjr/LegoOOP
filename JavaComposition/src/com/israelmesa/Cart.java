package com.israelmesa;

public class Cart extends MovingThings{
    private String manufacturer;

    public Cart(String color, boolean move, String manufacturer) {
        super(color, move);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
