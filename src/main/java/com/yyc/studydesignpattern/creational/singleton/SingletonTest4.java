package com.yyc.studydesignpattern.creational.singleton;

/**
 * 枚举法
 * 优点:
 * 1. 线程安全。
 * 2. 实现懒加载，避免浪费资源
 * 3. 可防止反序列化重新创建新的对象？
 * 缺点:
 */
public class SingletonTest4 {
    public static void main(String[] args) {
        Singleton4 instance1 = Singleton4.INSTANCE;
        Singleton4 instance2 = Singleton4.INSTANCE;

        System.out.println("instance1 == instance2: " + (instance1 == instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

enum Singleton4 {
    INSTANCE
}
