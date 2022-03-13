package com.yyc.studydesignpattern.oop.polymorphism;

/**
 * @author Frankie
 * @since 2022-03-13 3:56 PM
 *
 * 方法2: 接口类
 */
public class Example2 {

    public static void print(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Iterator array = new Array();
        print(array);

        Iterator linkedList = new LinkedList();
        print(linkedList);
    }
}
