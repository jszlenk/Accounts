package com.accounts.controller;

import com.accounts.service.Account;
import com.accounts.service.AccountsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountsController {

    private final AccountsRepository accountsRepository;

    public AccountsController(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    @GetMapping("/accounts")
    public List<Account> findAccounts(@RequestParam String customerId) {
        return accountsRepository.findAll();
    }
}
