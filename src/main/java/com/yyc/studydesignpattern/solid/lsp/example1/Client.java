package com.yyc.studydesignpattern.solid.lsp.example1;

import java.math.BigDecimal;

/**
 * @author Frankie
 * @since 2022-07-15 8:14 AM
 */
public class Client {
    public static void main(String[] args) {
        // BankingAppWithdrawService service = new BankingAppWithdrawService(new CurrentAccount());
        BankingAppWithdrawService service = new BankingAppWithdrawService(new SavingAccount());
        service.withdraw(BigDecimal.valueOf(100L));
    }
}
