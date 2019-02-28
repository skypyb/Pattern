package com.skypyb.observer.javaObserver;

import java.util.Arrays;
import java.util.Objects;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //创建多个观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.addObserver(obs3);

        printState(obs1, obs2, obs3);

        subject.setState(666);

        printState(obs1, obs2, obs3);

    }

    public static void printState(ObserverA... obs) {
        Arrays.stream(obs).filter(Objects::nonNull).forEach(o -> System.out.println(o.getMyState()));
    }
}
