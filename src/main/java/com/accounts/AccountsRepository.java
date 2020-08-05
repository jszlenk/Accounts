package com.accounts;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountsRepository extends CrudRepository<Account, Long> {

    Account findById(long id);

    List<Account> findAll();

}
