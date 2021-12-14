package com.yyc.studydesignpattern.creational.simplefactory.new1.order;

import com.yyc.studydesignpattern.creational.simplefactory.new1.pizza.CheesePizza;
import com.yyc.studydesignpattern.creational.simplefactory.new1.pizza.PepperPizza;
import com.yyc.studydesignpattern.creational.simplefactory.new1.pizza.Pizza;

/**
 * 简单工厂模式，也成为静态工厂模式
 */
public class SimpleFactory {

    /**
     * 根据名称创建不同的披萨
     */
    public static Pizza createPizza(String name) {
        Pizza pizza = null;
        if (name.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (name.equals("greek")) {
            pizza = new GreekPizza();
        } else if (name.equals("pepper")) {
            pizza = new PepperPizza();
        } else {
            System.out.println(name + " is not support!");
        }
        return pizza;
    }
}
