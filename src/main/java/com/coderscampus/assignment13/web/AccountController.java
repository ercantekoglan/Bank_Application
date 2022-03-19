package com.coderscampus.assignment13.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coderscampus.assignment13.domain.Account;
import com.coderscampus.assignment13.domain.User;
import com.coderscampus.assignment13.service.AccountService;
import com.coderscampus.assignment13.service.UserService;

@Controller
public class AccountController {

	@Autowired
	private AccountService accountService;
	@Autowired
	private UserService userService;

	// Getmapping for showing the user account information
	@GetMapping("/users/{userId}/accounts/{accountId}")
	public String getAccount(ModelMap modelMap, @PathVariable Long userId, @PathVariable Long accountId) {
		modelMap.put("user", userService.findByIdWithAccounts(userId));
		modelMap.put("account", accountService.findAccountById(accountId));
		return "accounts";
	}

	// Postmapping for creating the user bank account
	@PostMapping("/users/{userId}/accounts")
	public String createAccount(@PathVariable Long userId) {
		User user = userService.findById(userId);
		Account account = accountService.createAccount(user);
		return "redirect:/users/" + user.getUserId() + "/accounts/" + account.getAccountId();
	}

	// Postmapping for saving the user bank account
	@PostMapping("/users/{userId}/accounts/{accountId}")
	public String saveAccount(@PathVariable Long userId, @PathVariable Long accountId, Account account) {
		accountService.saveAccount(account);
		return "redirect:/users/" + userId + "/accounts/" + accountId;
	}

}
