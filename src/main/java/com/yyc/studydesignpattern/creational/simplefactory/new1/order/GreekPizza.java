package com.yyc.studydesignpattern.creational.simplefactory.new1.order;

import com.yyc.studydesignpattern.creational.simplefactory.new1.pizza.Pizza;

public class GreekPizza extends Pizza {

    public GreekPizza() {
        super.name = "希腊披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备希腊口味的披萨");
    }
}
