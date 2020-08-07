package com.accounts.controller.response;

import com.accounts.dto.AccountDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetAccountsResponse {

    long id;
    String nrb;
    String currency;
    Double availableFunds;
}
