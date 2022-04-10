package com.yyc.studydesignpattern.creational.singleton.enumsolution;

/**
 * 枚举法
 * 优点:
 * 1. 线程安全。
 * 2. 实现懒加载，避免浪费资源
 * 3. 可防止反序列化重新创建新的对象？
 * 缺点:
 */
public class Client1 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println("instance1 == instance2: " + (instance1 == instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
