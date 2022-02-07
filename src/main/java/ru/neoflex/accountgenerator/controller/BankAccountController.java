package ru.neoflex.accountgenerator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.accountgenerator.model.BankAccount;
import ru.neoflex.accountgenerator.service.BankAccountService;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class BankAccountController {

    private final BankAccountService bankAccountService;

    public BankAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    @GetMapping("/accounts/{count}")
    public List<BankAccount> getBankAccountList(@PathVariable int count) {
        return bankAccountService.getRandomAccounts(count);
    }
}