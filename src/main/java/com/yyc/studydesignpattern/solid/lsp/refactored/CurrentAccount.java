package com.yyc.studydesignpattern.solid.lsp.refactored;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author Frankie
 * @since 2022-07-15 8:31 AM
 */
@Slf4j
public class CurrentAccount extends WithdrawAccount {
    @Override
    protected void deposit(BigDecimal amount) {
        log.info("Deposit money={} in the CurrentAccount", amount);
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        log.info("Withdraw money={} in the CurrentAccount", amount);
    }
}
