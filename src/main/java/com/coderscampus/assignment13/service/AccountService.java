package com.coderscampus.assignment13.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment13.domain.Account;
import com.coderscampus.assignment13.domain.User;
import com.coderscampus.assignment13.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public Account findAccountById(Long userId) {
		Optional<Account> findById = accountRepository.findById(userId);
		return findById.orElseThrow();
	}

	public Account accountCreateOrUpdate(User user) {
		
		Account createdAccount = new Account();	
		createdAccount.setAccountName("Account #" + (user.getAccounts().size() + 1));	
		
		createdAccount.getUsers().add(user);
		user.getAccounts().add(createdAccount);
		
		return accountRepository.save(createdAccount);

	}
	
	public User findByIdWithAccounts(Long id) {
		return accountRepository.findByIdWithAccounts(id);
	}

	public Account saveAccount(Account account) {

		return accountRepository.save(account);
	}

}
