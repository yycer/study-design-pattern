package com.yyc.studydesignpattern.creational.factorymethod.pizza;

public class LDPepperPizza extends Pizza {

    public LDPepperPizza() {
        this.name = "伦敦胡椒披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备伦敦胡椒口味的披萨");
    }
}
