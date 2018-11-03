package com.skypyb.factory.factory;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = CarFactory.creatCar("奥迪");
        Car c2 = CarFactory.creatCar("宝马");

        c1.run();
        c2.run();

    }
}
