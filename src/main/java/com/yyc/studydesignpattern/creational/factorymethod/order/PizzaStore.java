package com.yyc.studydesignpattern.creational.factorymethod.order;

import com.yyc.studydesignpattern.creational.factorymethod.pizza.LDCheesePizza;

/**
 * 充当客户端角色
 */
public class PizzaStore {
    public static void main(String[] args) {
        new LDOrderPizza("pepper");
    }
}
