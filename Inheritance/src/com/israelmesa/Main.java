package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        //Treelike Inheritance
        //GeneralObject -> Human - Alien - Cart
        //Human -> Man - Woman

        Man man = new Man(true, "Green", "Gilbert");
        Cart cart = new Cart(true, "Red", "Ford");
        Alien alien = new Alien(true, "Yellow", "Saturn");

        System.out.println("Can man move? " + man.isMove());
        System.out.println("Man's name is: " + man.getName());
        System.out.println("Man's color is: " + man.getColor());

    }
}
