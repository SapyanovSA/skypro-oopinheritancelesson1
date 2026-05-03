package com.skypro;

import com.skypro.account.Account;
import com.skypro.account.bonus.BonusAccount;
import com.skypro.credit.CreditAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("com.skypro.Main.main");

        Account ivan = new CreditAccount("Ivan", 100, -50);
        System.out.println(ivan);
        Account.description();
        System.out.println("Приоритет " + ivan.priority);
        Account petr = new BonusAccount("Petr", 70, 150);
        System.out.println(petr);
        System.out.println("Приоритет " + ((BonusAccount)petr).priority);

        Account[] accounts = {ivan, petr};

        for (Account account : accounts) {
            account.validateAccount();
        }

        ivan.getAllFunds();
        petr.getAllFunds();
    }
}