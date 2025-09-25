package org.example.bankAccounts.factories;

import org.example.bankAccounts.BaseBankAccount;
import org.example.bankAccounts.SavingBankAccount;
import org.example.bankAccounts.StudentBankAccount;
import org.example.bankAccounts.generators.BankAccountNumberGenerator;
import org.example.people.BankAccountOwner;

public class BankAccountFactory {

    private final BankAccountNumberGenerator bankAccountNumberGenerator = new BankAccountNumberGenerator();

    public BaseBankAccount createBaseBankAccount(String uuid, BankAccountOwner owner, double balance) {
        String accountNumber = bankAccountNumberGenerator.generateRandomAccountNumber();

        return new BaseBankAccount(uuid, accountNumber, owner, balance);
    }

    public SavingBankAccount createSavingBankAccount(String uuid, BankAccountOwner owner, double balance) {
        String accountNumber = bankAccountNumberGenerator.generateRandomAccountNumber();

        return new SavingBankAccount(uuid, accountNumber, owner, balance);
    }

    public StudentBankAccount createStudentBankAccount(String uuid, BankAccountOwner owner, double balance, String schoolName) {
        String accountNumber = bankAccountNumberGenerator.generateRandomAccountNumber();

        return new StudentBankAccount(uuid, accountNumber, owner, balance, schoolName);
    }

}
