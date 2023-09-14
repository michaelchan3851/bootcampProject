package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts; // object reference

	public Bank() {
		// complete the function
		this.accounts = new LinkedHashMap<Long, Account>();
	}

	public Account getAccount(Long accountNumber) {
		// complete the function
		return this.accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		Long accountNumber = Long.valueOf(accounts.size() + 1);
		Account account = new CommercialAccount(company, accountNumber, pin, startingDeposit);
		accounts.put(accountNumber, account);
		return accountNumber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		Long accountNumber = Long.valueOf(accounts.size() + 1);
		Account account = new ConsumerAccount(person, accountNumber, pin, startingDeposit);
		accounts.put(accountNumber, account);
		return accountNumber;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		return true;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		Account account = this.accounts.get(accountNumber);
		if (account != null)
			return account.getBalance();
		return 0;
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		getAccount(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		return getAccount(accountNumber).debitAccount(amount);
	}
}
