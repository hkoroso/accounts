package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Accounts;

public interface IAccountsService {
/**
*param customerDto-CustomerDto-object
 **/
 void createAccount(CustomerDto customerDto);
Accounts getAccount(Long customerId);


}
