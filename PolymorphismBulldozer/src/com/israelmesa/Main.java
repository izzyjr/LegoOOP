package com.israelmesa;

class FactoryWorker {
    public double total;

    public FactoryWorker() {

    }

    public void count(int number) {
        total += (double) number;
        System.out.println("Total: " + total);
    }

    public void count(double number) {
        total += number;
        System.out.println("Total: " + total);
    }
}

public class Main {

    public static void main(String[] args) {
        FactoryWorker worker = new FactoryWorker();
        worker.count(4);
        worker.count(5);
        worker.count(4.5);


    }
}
