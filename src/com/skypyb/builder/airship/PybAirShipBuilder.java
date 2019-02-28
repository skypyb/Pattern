package com.skypyb.builder.airship;

public class PybAirShipBuilder implements AirShipBuilder {


    @Override
    public Engine builderEngine() {
        System.out.println("建造pyb牌发动机");
        return new Engine("pyb牌发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("建造pyb牌轨道舱");
        return new OrbitalModule("pyb牌轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("建造pyb牌逃逸塔");
        return new EscapeTower("pyb牌逃逸塔");
    }


}
