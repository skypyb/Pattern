package com.skypyb.factory.factory;

public class CarFactory {
    public static Car creatCar(String str){
        if (str.equals("奥迪")){
            return new Audi();
        }else if (str.equals("宝马")){
            return new BMW();
        }else{
            return null;
        }
    }
}
