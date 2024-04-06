package com.patrisrikanth.designpatterns.singleton;

// V5: SingletonClassWithDoubleChecking
public class SingletonClassWithDoubleChecking {
    private static SingletonClassWithDoubleChecking instance;

    private SingletonClassWithDoubleChecking() {

    }

    private static SingletonClassWithDoubleChecking getInstance() {
        if(instance == null) {
            synchronized (SingletonClassWithDoubleChecking.class) {
                if(instance == null) {
                    instance = new SingletonClassWithDoubleChecking();
                }
            }
        }

        return instance;
    }
}
