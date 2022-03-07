package com.yyc.studydesignpattern.behavioral.strategy;

/**
 * @author Frankie
 * @since 2022-03-07 9:04 AM
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        this.strategy.execute();
    }
}
