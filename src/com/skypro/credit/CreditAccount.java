package com.skypro.credit;

import com.skypro.account.Account;

public class CreditAccount extends Account {
    private int credit;

    public CreditAccount(String name, int balance, int credit) {
        super(name, balance);
        this.credit = credit;
    }

    @Override
    public void changeBalance(int amount) {
        if (balance + amount < credit) {
            throw new IllegalArgumentException("Денег нет");
        }
        this.balance = balance + amount;
    }

    @Override
    public String toString() {
        return "Аккаунт " + name + " имеет " + balance + " и " + credit + " возможный кредит.";
    }

    @Override
    public void getAllFunds() {
        System.out.println("Аккаунт " + name + " может потратить " + (balance - credit));
    }

    @Override
    protected void validateTransaction() {
        System.out.println("CreditAccount.validateTransaction");
    }

    @Override
    protected void validateOrigin() {
        System.out.println("CreditAccount.validateOrigin");
    }
}
