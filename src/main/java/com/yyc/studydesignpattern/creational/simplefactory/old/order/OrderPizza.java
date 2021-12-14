package com.yyc.studydesignpattern.creational.simplefactory.old.order;

import com.yyc.studydesignpattern.creational.simplefactory.old.pizza.CheesePizza;
import com.yyc.studydesignpattern.creational.simplefactory.old.pizza.GreekPizza;
import com.yyc.studydesignpattern.creational.simplefactory.old.pizza.Pizza;

/**
 * 订购披萨
 * 此类的问题: 未遵守OCP原则和demeter法则，应该减少Pizza实现类的耦合(CheesePizza, GreekPizza)
 */
public class OrderPizza {

    public OrderPizza(String name) {
        Pizza pizza = null;
        if (name.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (name.equals("greek")) {
            pizza = new GreekPizza();
        } else {
            System.out.println(name + " is not support!");
        }
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}
