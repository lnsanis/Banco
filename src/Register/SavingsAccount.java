package Register;

import java.util.Scanner;

//import java.util.Calendar;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(String nameClient, String cpf, double monthlyIncome, int accountNumber, int agency) {
		super(nameClient, cpf, monthlyIncome, accountNumber, agency);
	}

	public void incomeSimulation() {

		System.out.println("Informe a quantidade de meses para simular: ");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		System.out.println("Informe o valor que irá depositar mensalmente: ");
		double value = input.nextDouble();
		input.close();
		
		double annualFee = 0.85;
		double monthlyFee = annualFee / 12;
		double productValue = monthlyFee + 1;
		double simulatedValue = value * month * productValue;
		
		System.out.printf("O valor que terá em " + month + " meses é de: R$ %.2f ", + simulatedValue);

	}
}
