package Register;

public class BankAccount {
	
	private String nameClient;
	private String cpf;
	private double monthlyIncome;
	private Double balance;
	private int accountNumber;
	private int agency;
	
	
	
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
		String s = "Conta Bancária ["; 
		s += "Nome do cliente: " + nameClient;
		s += "; Número da conta: " + accountNumber;
		s += "; Saldo: " + balance;
		s += "]";
		return s; 
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	
	public void withdraw(double value) { 
		balance -= value; 
	}
	 
	
	public void accountBalance(double value) {
		System.out.println("Seu saldo é: " + balance);
	}
	
	
	
}
