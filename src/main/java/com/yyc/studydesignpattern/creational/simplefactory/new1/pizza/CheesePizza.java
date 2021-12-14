package com.yyc.studydesignpattern.creational.simplefactory.new1.pizza;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        super.name = "奶酪披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨的原材料");
    }
}
