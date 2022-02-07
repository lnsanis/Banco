//Essa � a classe pai dos tipos de conta que s�o cadastradas no sistema (os m�todos est�o no l� embaixo)

package register;

import java.util.Scanner;

public class BankAccount {
	
	private String nameClient;
	private String cpf;
	private double monthlyIncome;
	private Double balance;
	private int accountNumber;
	private int agency;
	
	
//Esse � o construtor da conta do usu�rio	
	public BankAccount(String nameClient, String cpf, double monthlyIncome, int accountNumber, int agency) {
		super();
		this.nameClient = nameClient;
		this.cpf = cpf;
		this.monthlyIncome = monthlyIncome;
		this.accountNumber = accountNumber;
		this.agency = agency;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(Double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAgency() {
		return agency;
	}

	public void setAgency(int agency) {
		this.agency = agency;
	}


	public String toString() { 
		String s = "Conta Banc�ria ["; 
		s += "Nome do cliente: " + nameClient;
		s += "; N�mero da conta: " + accountNumber;
		s += "; Saldo: " + balance;
		s += "]";
		return s; 
	}

//M�todo para depositar dinheiro da conta	
	
	public void deposit() {
		Scanner input = new Scanner(System.in);
		double value = input.nextDouble();
		input.close();
		balance += value;
		
	}
	
//M�todo para sacar dinheiro da conta	
	public void withdraw() { 
		Scanner input = new Scanner(System.in);
		double value = input.nextDouble();
		input.close();
		balance -= value; 
	}
	 
//M�todo para consultar o saldo da conta	
	public void accountBalance(double value) {
		System.out.println("Seu saldo �: " + balance);
	}
//M�todo para transferir dinheiro para outra conta	
	public void transfer(BankAccount destiny, double value) {
		balance = balance - value;
		destiny.balance = destiny.balance + value;
	}
	
}
