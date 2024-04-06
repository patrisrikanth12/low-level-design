package com.patrisrikanth.designpatterns.singleton;

// V3: SingletonClass with lazy instantiation
// problems:
// 1. Not thread safe. Perfectly okay for single threaded environment.
public class SingletonClassWithLazyInstantiation {
    private static SingletonClassWithLazyInstantiation instance;

    private SingletonClassWithLazyInstantiation() {

    }

    public static SingletonClassWithLazyInstantiation getInstance() {
        if(instance == null) {
            instance = new SingletonClassWithLazyInstantiation();
        }

        return instance;
    }
}
