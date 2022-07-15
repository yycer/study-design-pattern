package com.yyc.studydesignpattern.solid.lsp.example2;

import com.yyc.studydesignpattern.solid.lsp.example1.BankingAppWithdrawService;
import com.yyc.studydesignpattern.solid.lsp.example1.CurrentAccount;

import java.math.BigDecimal;

/**
 * @author Frankie
 * @since 2022-07-15 8:25 AM
 */
public class Client {
    public static void main(String[] args) {
        BankingAppWithdrawService service = new BankingAppWithdrawService(new CurrentAccount());
        // BankingAppWithdrawService service = new BankingAppWithdrawService(new FixTermDepositAccount());
        service.withdraw(new BigDecimal(100L));
    }
}
