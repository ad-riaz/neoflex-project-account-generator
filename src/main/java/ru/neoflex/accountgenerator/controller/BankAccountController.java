package ru.neoflex.accountgenerator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.accountgenerator.model.BankAccount;
import ru.neoflex.accountgenerator.service.BankAccountService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value = "/api")
public class BankAccountController {

    private final BankAccountService bankAccountService;

    public BankAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    @GetMapping ("/accounts")
    public List<BankAccount> getBankAccountList(@RequestParam(name = "count", required = false) Optional<Integer> count) {
        return bankAccountService.getRandomAccounts(count.orElse(0));
    }
}