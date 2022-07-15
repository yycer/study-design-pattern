package com.yyc.studydesignpattern.solid.lsp.example1;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author Frankie
 * @since 2022-07-15 8:20 AM
 */
@Slf4j
public class SavingAccount extends Account {
    @Override
    public void deposit(BigDecimal amount) {
        log.info("Deposit money={} in the SavingAccount", amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        log.info("Withdraw money={} in the SavingAccount", amount);
    }
}
