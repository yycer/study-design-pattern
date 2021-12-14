package com.yyc.studydesignpattern.creational.simplefactory.new1.pizza;

public abstract class Pizza {
    public String name;
    public abstract void prepare();

    public void bake() {
        System.out.println("烘焙" + name);
    }

    public void cut() {
        System.out.println("切割" + name);
    }

    public void box() {
        System.out.println("打包" + name);
    }
}
