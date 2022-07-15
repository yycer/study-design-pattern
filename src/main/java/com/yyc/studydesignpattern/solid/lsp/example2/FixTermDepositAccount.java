package com.yyc.studydesignpattern.solid.lsp.example2;

import com.yyc.studydesignpattern.solid.lsp.example1.Account;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author Frankie
 * @since 2022-07-15 8:25 AM
 */
@Slf4j
public class FixTermDepositAccount extends Account {

    @Override
    public void deposit(BigDecimal amount) {
        log.info("Deposit money={} in the FixTermDepositAccount", amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        throw new UnsupportedOperationException("Withdraws are not supported by FixTermDepositAccount!");
    }
}
