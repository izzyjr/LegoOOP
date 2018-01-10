package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        Cart cart = new Cart("Red", true, "Ford");
        Alien alien = new Alien("Blue", true, "Saturn");

        MovingThings movingMan = new MovingThings("The Simpson's", true);
        Man man = new Man("Juan", movingMan);

        MovingThings movingWoman = new MovingThings("The Simpson's", true);
        Woman woman = new Woman("Maria", movingWoman);

        System.out.println("Name: " + man.getName() + ", Color: "
                + man.getMovingThings().getColor() + ", Move: " + man.getMovingThings().isMove());

        System.out.println("Name: " + woman.getName() + ", Color: "
                + woman.getMovingThings().getColor() + ", Move: " + woman.getMovingThings().isMove());

        System.out.println("Color: " + alien.getColor() + ", Move: "
                + alien.isMove() + ", Planet: " + alien.getPlanet());

        System.out.println("Color: " + cart.getColor() + ", Move: "
                + cart.isMove() + ", Manufacturer: " + cart.getManufacturer());
    }
}
