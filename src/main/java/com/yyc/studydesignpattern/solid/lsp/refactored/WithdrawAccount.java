package com.yyc.studydesignpattern.solid.lsp.refactored;

import java.math.BigDecimal;

/**
 * @author Frankie
 * @since 2022-07-15 8:28 AM
 */
public abstract class WithdrawAccount extends Account {

    protected abstract void withdraw(BigDecimal amount);
}
