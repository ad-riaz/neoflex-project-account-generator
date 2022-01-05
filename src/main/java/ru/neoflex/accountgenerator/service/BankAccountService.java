package ru.neoflex.accountgenerator.service;

import org.springframework.stereotype.Service;
import ru.neoflex.accountgenerator.model.BankAccount;
import ru.neoflex.accountgenerator.model.Sex;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountService {
    private static int accountCounter = 10;
    private static int timeout = 15;

    private final DataRandomGenerator dataRandomGenerator;

    public BankAccountService(DataRandomGenerator dataRandomGenerator) {
        this.dataRandomGenerator = dataRandomGenerator;
    }

    public List<BankAccount> getRandomAccounts() {
        List<BankAccount> bankAccounts = new ArrayList<>();

        for (int i = 0; i < accountCounter; i++) {
            Sex sex = dataRandomGenerator.getRandomSex();
            bankAccounts.add(new BankAccount(
                    dataRandomGenerator.getRandomFirstName(sex).trim(),
                    dataRandomGenerator.getRandomMiddleName(sex).trim(),
                    dataRandomGenerator.getRandomLastName(sex).trim(),
                    dataRandomGenerator.getRandomAccountNumber(),
                    sex
            ));
        }

        return bankAccounts;
    }
}