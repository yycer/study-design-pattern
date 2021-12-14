package com.yyc.studydesignpattern.creational.singleton;

/**
 * 静态内部类
 * 优点:
 * 1. 通过静态内部类的特性做到线程安全。
 * 2. 实现懒加载，从而避免系统资源浪费。
 * 缺点:
 * 1. 需要创建额外的类。
 *
 * 静态内部类的特性: 静态内部类在Singleton3被装载的时候不会立即实例化，而是在调用getInstance()方法时，才会被装载，JVM会保证线程安全。
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        Singleton3.getInstance();
    }
}

class Singleton3 {
    private static class SingletonInstance3 {
        private static Singleton3 INSTANCE = new Singleton3();
    }
    public static Singleton3 getInstance() {
        return SingletonInstance3.INSTANCE;
    }
}
