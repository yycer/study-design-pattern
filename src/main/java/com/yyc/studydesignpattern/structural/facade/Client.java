package com.yyc.studydesignpattern.structural.facade;

/**
 * @author Frankie
 * @since 2022-03-06 3:46 PM
 */
public class Client {
    public static void main(String[] args) {
        BankAccountFacade facade = new BankAccountFacade(123, 123);
        facade.withdrawCash(200.00);
    }
}
