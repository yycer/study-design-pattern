package com.yyc.studydesignpattern.solid.lsp.refactored;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author Frankie
 * @since 2022-07-15 8:33 AM
 */
@Slf4j
public class FixTermDepositAccount extends Account {

    @Override
    protected void deposit(BigDecimal amount) {
        log.info("Deposit money={} in the FixTermDepositAccount", amount);
    }
}
