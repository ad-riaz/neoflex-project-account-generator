package ru.neoflex.accountgenerator.service;

import org.springframework.stereotype.Service;
import ru.neoflex.accountgenerator.model.BankAccount;
import ru.neoflex.accountgenerator.model.Sex;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountService {
    private final DataRandomGenerator dataRandomGenerator;

    public BankAccountService(DataRandomGenerator dataRandomGenerator) {
        this.dataRandomGenerator = dataRandomGenerator;
    }

    public List<BankAccount> getRandomAccounts(int accountCounter) {
        List<BankAccount> bankAccounts = new ArrayList<>();

        for (int i = 0; i < accountCounter; i++) {
            Sex sex = dataRandomGenerator.getRandomSex();
            String[] fullName = dataRandomGenerator.getRandomFullName(sex).split(" ");
            String firstName = fullName[0].trim();
            String middleName = fullName[1].trim();
            String lastName = fullName[2].trim();
            long accountNumber = dataRandomGenerator.getRandomAccountNumber();
            bankAccounts.add(BankAccount.builder()
                    .accountNumber(accountNumber)
                    .sex(sex)
                    .firstName(firstName)
                    .middleName(middleName)
                    .lastName(lastName)
                    .build());
        }

        return bankAccounts;
    }
}