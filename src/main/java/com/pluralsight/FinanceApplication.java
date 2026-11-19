package com.pluralsight;

import com.pluralsight.finance.*;

import java.math.BigDecimal;

public class FinanceApplication  {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Pam", "123", new BigDecimal(12500));
        Valuable account2 = new BankAccount("Gary", "456", new BigDecimal(1500));

        account1.deposit(BigDecimal.valueOf(100));
        //account2.deposit(BigDecimal.valueOf(100));

        //the second line doesn't work because it is relying on the valuable class. I would need to add the deposit method
        //or cast it as a bank account for all the methods to be useful.

        System.out.println(account1.getValue());

        Portfolio portfolio = new Portfolio("person", "company");
        portfolio.add(new House("person", 1987, 1300, 2));
        portfolio.add(new Gold("watch", 2.2));

        System.out.println(portfolio.getValue());
        System.out.println(portfolio.getLeastValuable().toString());
        System.out.println(portfolio.getMostValuable().toString());
    }
}
