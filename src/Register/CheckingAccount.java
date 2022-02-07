//Classe filha da BankAccount, essa é a classe da Conta Corrente

package register;

import java.util.Scanner;

public class CheckingAccount extends BankAccount {


	public CheckingAccount(String nameClient, String cpf, double monthlyIncome, int accountNumber, int agency) {
		super(nameClient, cpf, monthlyIncome, accountNumber, agency);
	}
//Validação do valor de cheque especial baseado na renda mensal do cliente
	public double overDraft() {
		double overDraftValue = this.getMonthlyIncome() * 0.20 * -1;
		return overDraftValue;
	}
//Validação de saque, verifica se será necessário usar o cheque especial
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
