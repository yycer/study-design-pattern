package com.yyc.studydesignpattern.creational.singleton;

/**
 * 懒汉式(双重检查锁)
 * 优点:
 * 1. 线程安全。
 * 2. 实现懒加载，避免浪费系统资源。
 * 缺点:
 * 1. 实现较为复杂，细节较多。
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();

        System.out.println("instance1 == instance2: " + (instance1 == instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton2 {
    private Singleton2() {}
    private static volatile Singleton2 INSTANCE;
    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton2();
                }
            }
        }
        return INSTANCE;
    }
}
