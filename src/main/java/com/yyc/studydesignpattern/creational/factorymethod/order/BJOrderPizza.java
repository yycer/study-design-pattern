package com.yyc.studydesignpattern.creational.factorymethod.order;

import com.yyc.studydesignpattern.creational.factorymethod.pizza.BJCheesePizza;
import com.yyc.studydesignpattern.creational.factorymethod.pizza.BJPepperPizza;
import com.yyc.studydesignpattern.creational.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

    public BJOrderPizza(String name) {
        super(name);
    }

    @Override
    Pizza createPizza(String name) {
        Pizza pizza = null;
        if (name.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (name.equals("pepper")) {
            pizza = new BJPepperPizza();
        } else {
            System.out.println(name + " is not support!");
        }
        return pizza;
    }
}
