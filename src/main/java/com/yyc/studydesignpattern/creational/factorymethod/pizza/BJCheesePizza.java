package com.yyc.studydesignpattern.creational.factorymethod.pizza;

public class BJCheesePizza extends Pizza {

    public BJCheesePizza() {
        super.name = "北京奶酪披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备北京奶酪披萨的原材料");
    }
}
