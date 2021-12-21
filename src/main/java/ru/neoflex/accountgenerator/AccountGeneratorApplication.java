package ru.neoflex.accountgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.neoflex.accountgenerator.service.BankAccountService;
import ru.neoflex.accountgenerator.service.DataRandomGenerator;

@SpringBootApplication
public class AccountGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountGeneratorApplication.class, args);
    }

}
