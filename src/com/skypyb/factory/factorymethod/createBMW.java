package com.skypyb.factory.factorymethod;

public class createBMW implements CarFactory{

    @Override
    public Car createCar() {

        return new BMW();
    }
}
