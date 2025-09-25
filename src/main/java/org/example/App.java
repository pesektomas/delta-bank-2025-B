package org.example;

import org.example.bankAccounts.BaseBankAccount;
import org.example.bankAccounts.SavingBankAccount;
import org.example.bankAccounts.StudentBankAccount;
import org.example.bankAccounts.factories.BankAccountFactory;
import org.example.bankAccounts.generators.BankAccountNumberGenerator;
import org.example.bankAccounts.services.BankAccountBalanceService;
import org.example.people.BankAccountOwner;
import org.example.people.BankAccountOwnerFactory;

public class App {

    public void run() {
        this.testBankAccounts();
    }

    private void testBankAccounts() {
        try {
            BankAccountFactory bankAccountFactory = new BankAccountFactory();
            BankAccountOwnerFactory bankAccountOwnerFactory = new BankAccountOwnerFactory();
            BankAccountBalanceService bankAccountBalanceService = new BankAccountBalanceService();

            BankAccountOwner owner = bankAccountOwnerFactory.createBankAccountOwner("O-123", "Tomas", "Pesek");
            System.out.println(owner.getUuid() + ": " + owner.getFullName());

            BaseBankAccount account1 = bankAccountFactory.createBaseBankAccount("base-bank-account-123", owner, 500);
            BaseBankAccount account2 = bankAccountFactory.createSavingBankAccount("saving-bank-account-123", owner, 500);
            BaseBankAccount account3 = bankAccountFactory.createStudentBankAccount("student-bank-account-123", owner, 500, "DELTA");

            System.out.println(account1.getUuid() + " (" + account1.getAccountNumber() + ") : " + account1.getBalance());
            System.out.println(account2.getUuid() + " (" + account2.getAccountNumber() + ") : " + ": " + account1.getBalance());
            System.out.println(account3.getUuid() + " (" + account3.getAccountNumber() + ") : " + ": " + account1.getBalance());

            // account1.addBalance(300);
            bankAccountBalanceService.deposit(account1, 300);
            System.out.println(account1.getUuid() + ": " + account1.getBalance());

            // account1.addBalance(200);
            bankAccountBalanceService.deposit(account1, 200);
            System.out.println(account1.getUuid() + ": " + account1.getBalance());

            // account1.addBalance(100);
            bankAccountBalanceService.deposit(account1, 100);
            System.out.println(account1.getUuid() + ": " + account1.getBalance());

            //account1.subtractBalance(500);
            bankAccountBalanceService.withdraw(account1, 500);
            System.out.println(account1.getUuid() + ": " + account1.getBalance());

            // account1.subtractBalance(5000);
            // bankAccountBalanceService.withdraw(account1, 5000);
            // System.out.println(account1.getUuid() + ": " + account1.getBalance());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
