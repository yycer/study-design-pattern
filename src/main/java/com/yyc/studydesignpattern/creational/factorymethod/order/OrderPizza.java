package com.yyc.studydesignpattern.creational.factorymethod.order;

import com.yyc.studydesignpattern.creational.factorymethod.pizza.Pizza;

/**
 * 订购披萨
 */
public abstract class OrderPizza {

    // 下沉创建披萨的时机到起子类
    abstract Pizza createPizza(String name);

    public OrderPizza(String name) {
        Pizza pizza = createPizza(name);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}
