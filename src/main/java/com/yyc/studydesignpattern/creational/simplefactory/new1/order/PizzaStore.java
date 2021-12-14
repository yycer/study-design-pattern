package com.yyc.studydesignpattern.creational.simplefactory.new1.order;

import com.yyc.studydesignpattern.creational.simplefactory.new1.pizza.OrderPizza;

/**
 * 充当客户端角色
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza("pepper");
    }
}
