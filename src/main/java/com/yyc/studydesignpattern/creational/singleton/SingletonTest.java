package com.yyc.studydesignpattern.creational.singleton;

/**
 * @author Frankie
 * @since 2022-03-06 11:09 AM
 *
 * 双重检查锁 + Optional
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("instance1 == instance2: " + (instance1 == instance2));
    }
}

class Singleton {
    // 避免通过构造器创建对象
    private Singleton() {}
    //
    private static volatile Singleton INSTANCE;

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            // 避免两个线程同时创建对象
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
