package com.skypro.account;

public abstract class Account {

    protected String name;
    protected int balance;

    public int priority = 5;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void changeBalance(int amount) {
        if (balance + amount < 0) {
            throw new IllegalArgumentException("Денег нет");
        }
        this.balance = balance + amount;
    }

    public static void description() {
        System.out.println("Базовый аккаунт");
    }

    @Override
    public String toString() {
        return "Аккаунт " + name + " имеет " + balance;
    }

    public abstract void getAllFunds();

    public void validateAccount() {
        validateOrigin();
        validateTransaction();
    }

    protected abstract void validateTransaction();

    protected abstract void validateOrigin();
}
