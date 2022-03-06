package com.yyc.studydesignpattern.structural.facade;

/**
 * @author Frankie
 * @since 2022-03-06 3:47 PM
 */
public class AccountNumberCheck {
    private static volatile AccountNumberCheck INSTANCE;
    private int accountNumber = 123;

    private AccountNumberCheck() {}

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public boolean isAccountActive(int accNumToCheck) {
        return accNumToCheck == accountNumber;
    }

    public static AccountNumberCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (AccountNumberCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AccountNumberCheck();
                }
            }
        }
        return INSTANCE;
    }
}
