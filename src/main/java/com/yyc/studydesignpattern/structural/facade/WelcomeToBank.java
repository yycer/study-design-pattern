package com.yyc.studydesignpattern.structural.facade;

/**
 * @author Frankie
 * @since 2022-03-06 3:46 PM
 */
public class WelcomeToBank {
    private static volatile WelcomeToBank INSTANCE;

    private WelcomeToBank() {}

    public static WelcomeToBank getInstance() {
        if (INSTANCE == null) {
            synchronized (WelcomeToBank.class) {
                if (INSTANCE == null) {
                    INSTANCE = new WelcomeToBank();
                    System.out.println("Welcome to My Bank.");
                }
            }
        }
        return INSTANCE;
    }
}
