package com.theironyard.novauc;

/**
 * Created by daveoffice on 2/13/17.
 */
public class Account {

    public Integer accountNumber;
    public Double balance;

    public Account(final Integer accountNumber, final Double initialBalance) {
        this.accountNumber = accountNumber;
        balance = initialBalance;
    }

    public Double deposit (double depositAmmount) {
        balance += depositAmmount;
        return balance;
    }

    public Double withdraw(double withdrawAmmount) {
        balance -= withdrawAmmount;
        return balance;
    }

    public Double getBalance() {
        return balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }



}
