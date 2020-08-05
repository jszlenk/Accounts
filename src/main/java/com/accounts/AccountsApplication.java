package com.accounts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccountsApplication {

    private static final Logger log = LoggerFactory.getLogger(AccountsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class);
    }

    @Bean
    public CommandLineRunner createRecord(AccountsRepository repository) {
        return (args) -> {
            repository.save(new Account("72249000059957936727967706", "PLN", 6525.11));

            log.info("Accounts found with findAll():");
            for (Account account : repository.findAll()) {
                log.info(account.toString());
            }
            log.info("-------------------------------");

            Account account = repository.findById(1L);
            log.info("Account found with findById(1L):");
            log.info(account.toString());
        };
    }
}
