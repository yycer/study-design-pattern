package com.yyc.studydesignpattern.structural.facade;

/**
 * @author Frankie
 * @since 2022-03-06 3:47 PM
 */
public class SecurityCodeCheck {
    private static volatile SecurityCodeCheck INSTANCE;
    private int securityCode = 123;

    private SecurityCodeCheck() {}

    public int getSecurityCode() {
        return this.securityCode;
    }

    public boolean isCodeCorrect(int secCodeToCheck) {
        return secCodeToCheck == securityCode;
    }

    public static SecurityCodeCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (SecurityCodeCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SecurityCodeCheck();
                }
            }
        }
        return INSTANCE;
    }
}
