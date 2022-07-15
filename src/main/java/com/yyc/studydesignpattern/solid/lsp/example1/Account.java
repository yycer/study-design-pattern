package com.yyc.studydesignpattern.solid.lsp.example1;

import java.math.BigDecimal;

/**
 * @author Frankie
 * @since 2022-07-15 8:14 AM
 */
public abstract class Account {

    public abstract void deposit(BigDecimal amount);
    public abstract void withdraw(BigDecimal amount);
}
