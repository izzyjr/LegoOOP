package com.israelmesa;

public class Cart extends GeneralObject{
    private String manufacturer;

    public Cart(boolean move, String color, String manufacturer) {
        super(move, color);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
