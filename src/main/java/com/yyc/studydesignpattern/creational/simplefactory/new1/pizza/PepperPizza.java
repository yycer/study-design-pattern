package com.yyc.studydesignpattern.creational.simplefactory.new1.pizza;

public class PepperPizza extends Pizza {

    public PepperPizza() {
        this.name = "胡椒披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备胡椒口味的披萨");
    }
}
