package com.patrisrikanth.designpatterns.singleton;

// V2: With Static Block
public class SingletonClassWithStaticBlock {
    private static SingletonClassWithStaticBlock instance;

    private SingletonClassWithStaticBlock() {

    }

    static {
        try {
            instance = new SingletonClassWithStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception while creating singleton class");
        }
    }

    public static SingletonClassWithStaticBlock getInstance() {
        return instance;
    }
}
