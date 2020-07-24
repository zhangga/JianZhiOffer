package com.abc.ex002_singleton;

/**
 * 默认初始化
 * Created by U-Demon
 * Date: 2020/6/8
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

}
