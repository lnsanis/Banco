package Register;

import java.util.Scanner;

public class CheckingAccount extends BankAccount {


	public CheckingAccount(String nameClient, String cpf, double monthlyIncome, int accountNumber, int agency) {
		super(nameClient, cpf, monthlyIncome, accountNumber, agency);
	}

	public double overDraft() {
		double overDraftValue = this.getMonthlyIncome() * 0.20 * -1;
		return overDraftValue;
	}

	public void withDraw() {
		System.out.println("Insira o valor para saque: ");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		input.close();
		double valueAfterWithdraw = this.getBalance() - amount;
		if (valueAfterWithdraw < 0 && valueAfterWithdraw >= overDraft()) {
			this.withdraw(amount);
		} 
		else if(valueAfterWithdraw < 0 && valueAfterWithdraw < overDraft()) {
			System.out.println("Valor passou do limite do cheque especial");
			withDraw();
		}
		else {
			this.withdraw(amount);
		}
	}
}
