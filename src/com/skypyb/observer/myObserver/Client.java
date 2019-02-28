package com.skypyb.observer.myObserver;

import java.util.Arrays;
import java.util.Objects;

public class Client {

    public static void main(String[] args) {
        //目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //创建多个观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        //将这仨观察者放到subject对象的观察者队伍中
        subject.registerObs(obs1, obs2, obs3);

        printState(obs1, obs2, obs3);

        //改变参数
        subject.setState(666);

        printState(obs1, obs2, obs3);
    }


    public static void printState(ObserverA... obs) {
        Arrays.stream(obs).filter(Objects::nonNull).forEach(o -> System.out.println(o.getMyState()));
    }
}
