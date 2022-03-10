package com.yyc.studydesignpattern.behavioral.observer.old;

import java.util.Random;

/**
 * @author Frankie
 * @since 2022-03-09 9:37 AM
 */
public class Client {
    private static final Random random = new Random();

    public static void main(String[] args) {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult lotteryResult = lotteryService.doDraw(random.nextInt(1000));
        System.out.printf("lotteryResult=%s", lotteryResult);
    }
}
