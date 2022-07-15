package com.yyc.studydesignpattern.solid.lsp.example1;

import java.math.BigDecimal;

/**
 * @author Frankie
 * @since 2022-07-15 8:21 AM
 */
public class BankingAppWithdrawService {

    private Account account;

    public BankingAppWithdrawService(Account account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }
}
