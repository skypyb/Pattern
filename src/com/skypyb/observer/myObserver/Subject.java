package com.skypyb.observer.myObserver;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Subject {

    private static Set<Observer> servers = new CopyOnWriteArraySet<>();

    public void registerObs(Observer... obs) {
        Arrays.stream(obs).forEach(servers::add);
    }

    public void removeObs(Observer obs) {
        servers.remove(obs);
    }

    //通知所有的观察者
    public void notifyAllObs() {
        servers.stream().filter(Objects::nonNull).forEach(obs -> obs.update(this));
    }
}


