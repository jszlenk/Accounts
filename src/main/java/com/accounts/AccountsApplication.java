package com.accounts;

import com.accounts.dto.AccountDto;
import com.accounts.entity.Account;
import com.accounts.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class);
    }

    @Bean
    public CommandLineRunner createAccounts(AccountService accountService) {
        return (args) -> {
            accountService.save(new Account("72249000059957936727967706", "PLN", 6525.11));

            log.info("Accounts found with findAll():");
            for (Account account : accountService.getAll()) {
                log.info(account.toString());
            }
            log.info("-------------------------------");

            Optional<Account> account = accountService.get(1L);
            log.info("Account found with findById(1L):");
            log.info(account.toString());
        };
    }
}
