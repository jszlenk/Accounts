package com.accounts.repository;

import com.accounts.dto.AccountDto;
import com.accounts.entity.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountsRepository extends CrudRepository<Account, Long> {

    Account findById(long id);
    List<Account> findAll();
}
