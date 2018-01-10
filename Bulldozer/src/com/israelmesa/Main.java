package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        //Class, Objects and Constructors

        BullDozer bullDozer = new BullDozer("Blue", "Mini");
//	    bullDozer.setColor("Blue");
//	    bullDozer.setSize("Mini");
        System.out.println("Color: " + bullDozer.getColor());
        System.out.println("Size: " + bullDozer.getSize());

        BullDozer bullDozer2 = new BullDozer("Red", "Large");
//        bullDozer2.setColor("Red");
//        bullDozer2.setSize("Large");
        System.out.println("Color: " + bullDozer2.getColor());
        System.out.println("Size: " + bullDozer2.getSize());



    }
}
