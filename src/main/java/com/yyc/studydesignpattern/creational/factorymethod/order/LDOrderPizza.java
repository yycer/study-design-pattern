package com.yyc.studydesignpattern.creational.factorymethod.order;

import com.yyc.studydesignpattern.creational.factorymethod.pizza.LDCheesePizza;
import com.yyc.studydesignpattern.creational.factorymethod.pizza.LDPepperPizza;
import com.yyc.studydesignpattern.creational.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

    public LDOrderPizza(String name) {
        super(name);
    }

    @Override
    Pizza createPizza(String name) {
        Pizza pizza = null;
        if (name.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (name.equals("pepper")) {
            pizza = new LDPepperPizza();
        } else {
            System.out.println(name + " is not support!");
        }
        return pizza;
    }
}
