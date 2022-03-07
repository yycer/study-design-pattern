package com.yyc.studydesignpattern.behavioral.strategy;

/**
 * @author Frankie
 * @since 2022-03-07 9:04 AM
 */
public interface Strategy {
    void execute();
}

class FirstStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("Called FirstStrategy.execute()");
    }
}

class SecondStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("Called SecondStrategy.execute()");
    }
}

class ThirdStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("Called ThirdStrategy.execute()");
    }
}
