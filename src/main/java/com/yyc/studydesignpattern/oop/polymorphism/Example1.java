package com.yyc.studydesignpattern.oop.polymorphism;

/**
 * @author Frankie
 * @since 2022-03-13 3:51 PM
 * 
 * 多态是指，子类可以替代父类。
 *
 * 方式1: 集成加方法重写
 */
public class Example1 {

    public static void test(DynamicArray dynamicArray) {
        dynamicArray.add(5);
        dynamicArray.add(1);
        dynamicArray.add(3);
        for (int i = 0; i < dynamicArray.size; i++) {
            System.out.println(dynamicArray.get(i));
        }
    }

    public static void main(String[] args) {
        // 父类对象可以引用子类对象
        DynamicArray sortedDynamicArray = new SortedDynamicArray();
        test(sortedDynamicArray);
    }
}
