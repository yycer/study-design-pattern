package com.yyc.studydesignpattern.solid.lsp.refactored;

import java.math.BigDecimal;

/**
 * @author Frankie
 * @since 2022-07-15 8:34 AM
 */
public class BankingAppWithdrawService {

    private WithdrawAccount account;

    public BankingAppWithdrawService(WithdrawAccount account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }
}
