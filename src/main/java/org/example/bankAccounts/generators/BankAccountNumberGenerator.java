package org.example.bankAccounts.generators;

import java.util.Random;

public class BankAccountNumberGenerator {

    /**
     * Generates a random bank account number as a string.
     * The number has 10 digits and can contain leading zeros.
     */
    public String generateRandomAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder();

        // Generate 10 random digits (0–9)
        for (int i = 0; i < 10; i++) {
            int digit = random.nextInt(10);
            accountNumber.append(digit);
        }

        return accountNumber.toString();
    }

}
