package com.accounts.service;

import com.accounts.dto.AccountDto;
import com.accounts.entity.Account;
import com.accounts.repository.AccountsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountsRepository accountsRepository;

    public Optional<Account> get(long id) {
        return Optional.ofNullable(accountsRepository.findById(id));
    }

    public List<Account> getAll() {
        return accountsRepository.findAll();
    }

    public List<Account> getAccountsForCustomer(long id) {
        return accountsRepository.findAll();
    }

    public void save(Account account) {
        accountsRepository.save(account);
    }
}
