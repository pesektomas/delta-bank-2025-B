package org.example;

import org.example.bankAccounts.BaseBankAccount;
import org.example.bankAccounts.SavingBankAccount;
import org.example.bankAccounts.StudentBankAccount;
import org.example.people.BankAccountOwner;

public class App {

    public void run() {
        this.testBankAccounts();
    }

    private void testBankAccounts() {
        try {
            BankAccountOwner owner = new BankAccountOwner("O-123", "Tomas", "Pesek");
            System.out.println(owner.getUuid() + ": " + owner.getFullName());


            BaseBankAccount account1 = new BaseBankAccount("base-bank-account-123", "123", owner, 500);
            BaseBankAccount account2 = new SavingBankAccount("saving-bank-account-123", "123", owner, 500);
            BaseBankAccount account3 = new StudentBankAccount("student-bank-account-123", "123", owner, 500, "DELTA");

            System.out.println(account1.getUuid() + ": " + account1.getBalance());
            System.out.println(account2.getUuid() + ": " + account1.getBalance());
            System.out.println(account3.getUuid() + ": " + account1.getBalance());

            account1.addBalance(300);
            System.out.println(account1.getUuid() + ": " + account1.getBalance());

            account1.addBalance(200);
            System.out.println(account1.getUuid() + ": " + account1.getBalance());

            account1.addBalance(100);
            System.out.println(account1.getUuid() + ": " + account1.getBalance());

            account1.subtractBalance(500);
            System.out.println(account1.getUuid() + ": " + account1.getBalance());

            // account1.subtractBalance(5000);
            // System.out.println(account1.getUuid() + ": " + account1.getBalance());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
