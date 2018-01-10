package com.israelmesa;

public class Main {

    public static void main(String[] args) {
        FactoryWorker worker = new FactoryWorker();

        int total = worker.addNumbers(2,3);
        System.out.println("total: " + total);
    }
}

class FactoryWorker {
    public FactoryWorker() {

    }

    public int addNumbers(int num1, int num2){
        return num1 + num2;
    }
}
