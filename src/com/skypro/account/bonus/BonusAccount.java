package com.skypro.account.bonus;

import com.skypro.account.Account;

public class BonusAccount extends Account {

    private int bonuses;

    public int priority = 10;

    public BonusAccount(String name, int balance, int bonuses) {
        super(name, balance);
        this.bonuses = bonuses;
    }

    public static void description() {
        System.out.println("Бонусный аккаунт");
    }

    @Override
    public void changeBalance(int amount) {
        super.changeBalance(amount);
        bonuses = bonuses - amount;
    }

    @Override
    public String toString() {
        return "Аккаунт " + name + " имеет " + balance + " и " + bonuses + " бонусы.";
    }

    @Override
    public void getAllFunds() {
        System.out.println("Аккаунт " + name + " может потратить " + (balance + bonuses));
    }

    @Override
    public void validateOrigin() {
        System.out.println("BonusAccount.validateOrigin");
    }

    @Override
    protected void validateTransaction() {
        System.out.println("BonusAccount.validateTransaction");
    }
}
