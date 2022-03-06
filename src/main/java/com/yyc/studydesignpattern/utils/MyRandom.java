package com.yyc.studydesignpattern.utils;

import java.util.Random;

/**
 * @author Frankie
 * @since 2022-03-06 7:41 PM
 */
public class MyRandom {
    private static volatile Random RANDOM;
    private MyRandom() {}

    public static Random getInstance() {
        if (RANDOM == null) {
            synchronized (MyRandom.class) {
                if (RANDOM == null) {
                    RANDOM = new Random();
                }
            }
        }
        return RANDOM;
    }
}
