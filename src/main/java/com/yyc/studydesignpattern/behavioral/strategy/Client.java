package com.yyc.studydesignpattern.behavioral.strategy;

/**
 * @author Frankie
 * @since 2022-03-07 9:04 AM
 */
public class Client {

    public static void main(String[] args) {
        Context context;

        System.out.println("================= FirstStrategy =======================");
        context = new Context(new FirstStrategy());
        context.execute();

        System.out.println("================= SecondStrategy =======================");
        context = new Context(new SecondStrategy());
        context.execute();

        System.out.println("================= ThirdStrategy =======================");
        context = new Context(new ThirdStrategy());
        context.execute();
    }
}
