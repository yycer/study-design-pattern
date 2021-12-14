package com.yyc.studydesignpattern.creational.factorymethod.pizza;

public class BJPepperPizza extends Pizza {

    public BJPepperPizza() {
        this.name = "北京胡椒披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备北京胡椒口味的披萨");
    }
}
