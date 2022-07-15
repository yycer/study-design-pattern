package com.yyc.studydesignpattern.solid.lsp.refactored;

import java.math.BigDecimal;

/**
 * @author Frankie
 * @since 2022-07-15 8:35 AM
 */
public class Client {
    public static void main(String[] args) {
        BankingAppWithdrawService service = new BankingAppWithdrawService(new CurrentAccount());
        // BankingAppWithdrawService service = new BankingAppWithdrawService(new SavingAccount());
        // BankingAppWithdrawService service = new BankingAppWithdrawService(new FixTermDepositAccount());
        service.withdraw(new BigDecimal(100L));
    }
}
