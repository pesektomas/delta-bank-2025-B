package org.example;

import org.example.bankAccounts.BankAccount;
import org.example.bankAccounts.BaseBankAccount;
import org.example.bankAccounts.SavingBankAccount;
import org.example.people.BankAccountOwner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        try {
            BankAccountOwner owner = new BankAccountOwner("O-123", "Tomas", "Pesek");
            System.out.println(owner.getUuid() + ": " + owner.getFullName());

            // TODO add class for generating account numbers
            BaseBankAccount account1 = new BankAccount("A-123", "123", owner, 500);
            BaseBankAccount account2 = new SavingBankAccount("A-123", "123", owner, 500);

            /* if (account2 instanceof SavingBankAccount) {
                float interestRate = ((SavingBankAccount)account2).getInterestRate();
            } */

            // account1 -> type??

            System.out.println(account1.getUuid() + ": " + account1.getBalance());

            account1.addBalance(300);
            System.out.println(account1.getUuid() + ": " + account1.getBalance());

            account1.addBalance(200);
            System.out.println(account1.getUuid() + ": " + account1.getBalance());

            account1.addBalance(100);
            System.out.println(account1.getUuid() + ": " + account1.getBalance());

            account1.subtractBalance(500);
            System.out.println(account1.getUuid() + ": " + account1.getBalance());

            account1.subtractBalance(5000);
            System.out.println(account1.getUuid() + ": " + account1.getBalance());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}