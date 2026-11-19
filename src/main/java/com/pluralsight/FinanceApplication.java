package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

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
    }
}
