package com.yyc.studydesignpattern.oop.encapsulation;


import java.math.BigDecimal;

/**
 * @author Frankie
 * @since 2022-03-13 3:31 PM
 *
 * 并不是所有字段都需要向外暴露setter方法，
 * 对于钱包的编号(id)和创建时间(createdTime)而言，在创建数字钱包时就已经确定且不会更改。
 * 对于余额(balance)和余额最后修改时间(balanceLastModifiedTime)字段而言，它们会随着余额的增加或修改一起改变，所以可以将其封装在一个方法中。
 */
public class Wallet {
    private String id;
    private long createdTime;
    private BigDecimal balance;
    private long balanceLastModifiedTime;

    public Wallet() {
        this.id = "123";
        this.createdTime = System.currentTimeMillis();
        this.balance = BigDecimal.ZERO;
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    public void increaseBalance(BigDecimal increasedAmount) {
        if (increasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("InvalidAmountException");
        }
        this.balance.add(increasedAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    public void decreaseBalance(BigDecimal decreasedAmount) {
        if (decreasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("InvalidAmountException");
        }
        if (decreasedAmount.compareTo(this.balance) > 0) {
            throw new RuntimeException("InsufficientAmountException");
        }
        this.balance.subtract(decreasedAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    public String getId() {
        return id;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public long getBalanceLastModifiedTime() {
        return balanceLastModifiedTime;
    }
}
