package org.example.bankAccounts;

import org.example.people.BankAccountOwner;

public class SavingBankAccount extends BaseBankAccount {

    private final float interestRate;


    public SavingBankAccount(String uuid, String accountNumber, BankAccountOwner owner, double balance) {
        super(uuid, accountNumber, owner, balance);

        interestRate = 5;
    }

    public float getInterestRate() {
        return interestRate;
    }
}
