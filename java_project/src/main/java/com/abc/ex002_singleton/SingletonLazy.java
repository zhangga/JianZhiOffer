package com.abc.ex002_singleton;

/**
 * 按需创建
 * Created by U-Demon
 * Date: 2020/6/8
 */
public class SingletonLazy {

    private static class SingletonHolder {
        private static SingletonLazy INSTANCE = new SingletonLazy();
    }

    private SingletonLazy() {

    }

    public static SingletonLazy getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
