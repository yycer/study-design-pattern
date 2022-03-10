package com.yyc.studydesignpattern.behavioral.observer.refactor;

import com.yyc.studydesignpattern.behavioral.observer.old.LotteryResult;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @author Frankie
 * @since 2022-03-10 8:47 AM
 */
@Slf4j
public class Client {

    private static final Random random = new Random();

    public static void main(String[] args) {
        LotteryService2 lotteryService2 = new LotteryServiceImpl2();
        LotteryResult result = lotteryService2.draw(random.nextInt(1000));
        log.info("result={}", result);
    }
}
