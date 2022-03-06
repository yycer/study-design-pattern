package com.yyc.studydesignpattern.structural.facade;

/**
 * @author Frankie
 * @since 2022-03-06 3:47 PM
 *
 * Facade本意是指建筑的门面，代表将其错综复杂的细节隐藏，仅暴露给用户简单的接口。
 */
public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;
    private WelcomeToBank bankWelcome;
    private AccountNumberCheck accChecker;
    private SecurityCodeCheck codeChecker;
    private FundsCheck fundsChecker;

    public BankAccountFacade(int accNum, int secCode) {
        this.accountNumber = accNum;
        this.securityCode = secCode;
        this.bankWelcome = WelcomeToBank.getInstance();
        this.accChecker = AccountNumberCheck.getInstance();
        this.codeChecker = SecurityCodeCheck.getInstance();
        this.fundsChecker = FundsCheck.getInstance();
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getSecurityCode() {
        return this.securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if (accChecker.isAccountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode()) && fundsChecker.haveEnoughMoney(cashToGet)) {
            fundsChecker.decreaseCashInAccount(cashToGet);
            System.out.println("Transaction Complete");
        } else {
            System.out.println("Transaction Failed");
        }
    }
}
