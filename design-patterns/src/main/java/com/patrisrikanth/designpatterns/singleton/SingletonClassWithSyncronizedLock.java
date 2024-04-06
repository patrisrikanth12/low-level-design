package com.patrisrikanth.designpatterns.singleton;

// V4: SingletonClass with synchronized method
// problems:
// 1. Decreases the performance of the multithreaded application.
public class SingletonClassWithSyncronizedLock {
    private static SingletonClassWithSyncronizedLock instance;

    private SingletonClassWithSyncronizedLock() {

    }

    private static synchronized SingletonClassWithSyncronizedLock getInstance() {
        if(instance == null) {
            instance = new SingletonClassWithSyncronizedLock();
        }

        return instance;
    }
}
