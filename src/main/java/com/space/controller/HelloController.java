package com.space.controller;

import com.space.data.Account;
import com.space.data.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ivan Timofeev on 23.05.2016.
 */

@RestController
public class HelloController {

	@Autowired
	private AccountRepository accountRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Account get()
	{
		Account account = new Account();
		account.setEmail("kiberaction@yandex.ru");
		account.setLogin("login");
		account.setPassword("password");
		account = accountRepository.save(account);
		return accountRepository.findOne(account.getId());
	}
}
