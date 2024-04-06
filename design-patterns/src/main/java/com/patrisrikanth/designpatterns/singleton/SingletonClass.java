package com.patrisrikanth.designpatterns.singleton;

// v1: Eager Instantiation
public class SingletonClass {
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        return instance;
    }
}