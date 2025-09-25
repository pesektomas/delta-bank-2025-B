package org.example.bankAccounts;

import org.example.people.BankAccountOwner;

public abstract class BankAccount extends  BaseBankAccount {

    public BankAccount(String uuid, String accountNumber, BankAccountOwner owner, double balance) {
        super(uuid, accountNumber, owner, balance);
    }

}
