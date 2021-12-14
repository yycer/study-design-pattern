package com.yyc.studydesignpattern.creational.singleton;

/**
 * 饿汉式
 * 优点:
 * 1. 实现简单。
 * 2. 通过JVM的类装载保证线程安全。
 * 缺点:
 * 1. 非懒加载，从而可能造成系统资源浪费。
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println("instance1 == instance2: " + (instance1 == instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton1 {
    private static final Singleton1 SINGLETON = new Singleton1();
    // 构造器私有化
    private Singleton1() {}
    public static Singleton1 getInstance() {
        return SINGLETON;
    }
}