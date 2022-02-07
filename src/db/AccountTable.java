package db;

import java.util.ArrayList;

import register.BankAccount;

public class AccountTable {
	
	private static ArrayList<BankAccount> accountsArray = new ArrayList<BankAccount>();
	
	public static void addAccount(BankAccount account) {
		accountsArray.add(account);
		
	}
	
	public static BankAccount getAccountByAccountNumber(int accountNumber) {
		BankAccount account = null;
		
		for (int i = 0; i <= accountsArray.size(); i++) {
			BankAccount accountInArray = accountsArray.get(i);
			if(accountInArray.getAccountNumber() == accountNumber) {
				account = accountInArray;
				break;
			}
		}
		
		return account;
		
	}
}
