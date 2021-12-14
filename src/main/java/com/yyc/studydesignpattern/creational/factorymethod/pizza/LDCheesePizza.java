package com.yyc.studydesignpattern.creational.factorymethod.pizza;

public class LDCheesePizza extends Pizza {

    public LDCheesePizza() {
        super.name = "伦敦奶酪披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备伦敦奶酪披萨的原材料");
    }
}
