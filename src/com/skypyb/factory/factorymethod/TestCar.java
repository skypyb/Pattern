package com.skypyb.factory.factorymethod;


public class TestCar {
    public static void main(String[] args) {
        Car c1 = new createAudi().createCar();
        Car c2 = new createBMW().createCar();

        c1.run();
        c2.run();

    }
}
