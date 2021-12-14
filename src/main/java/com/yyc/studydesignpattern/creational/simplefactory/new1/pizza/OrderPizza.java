package com.yyc.studydesignpattern.creational.simplefactory.new1.pizza;

import com.yyc.studydesignpattern.creational.simplefactory.new1.order.SimpleFactory;

/**
 * 订购披萨
 */
public class OrderPizza {

    public OrderPizza(String name) {
        Pizza pizza = SimpleFactory.createPizza(name);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}
