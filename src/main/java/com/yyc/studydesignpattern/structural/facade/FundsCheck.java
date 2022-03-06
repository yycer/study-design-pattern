package com.yyc.studydesignpattern.structural.facade;

/**
 * @author Frankie
 * @since 2022-03-06 3:47 PM
 */
public class FundsCheck {
    private static volatile FundsCheck INSTANCE;
    private double cashInAccount = 1000.00;

    private FundsCheck() {}

    public double getCashInAccount() {
        return this.cashInAccount;
    }

    public void decreaseCashInAccount(double cashToWithdrawal) {
        this.cashInAccount -= cashToWithdrawal;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal) {
        return getCashInAccount() >= cashToWithdrawal;
    }

    public static FundsCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (FundsCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FundsCheck();
                }
            }
        }
        return INSTANCE;
    }
}
