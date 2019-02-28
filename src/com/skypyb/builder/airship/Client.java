package com.skypyb.builder.airship;

public class Client {

    //建造者模式使用
    public static void main(String[] args) {

        AirShipDirector director = new PybAirShipDirector(new PybAirShipBuilder());
        AirShip build = director.build();

        build.launch();
    }
}
