package org.example.bankAccounts;

import org.example.people.BankAccountOwner;

public class StudentBankAccount extends BaseBankAccount {

    private final String schoolName;


    public StudentBankAccount(String uuid, String accountNumber, BankAccountOwner owner, double balance, String schoolName) {
        super(uuid, accountNumber, owner, balance);

        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
