package com.skypyb.factory.factorymethod;

public class createAudi implements CarFactory{

    @Override
    public Car createCar() {
        return new Audi();
    }
}
