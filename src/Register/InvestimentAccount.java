package Register;

import java.util.Scanner;

public class InvestimentAccount extends BankAccount{

	public InvestimentAccount(String nameClient, String cpf, double monthlyIncome, int accountNumber, int agency) {
		super(nameClient, cpf, monthlyIncome, accountNumber, agency);
	}

	public static void invest() {
		
		System.out.println("Selecione o tipo de investimento:\n");
		System.out.println("Op��o 1: Tesouro Direto com rendimento fixo de 8%");
		System.out.println("Op��o 2: Fundos de investimento com rendimento vari�vel, a m�dia pode chegar a 9%");
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		switch(option) {
		case 1:
			directTreasure();
			break;
			
		case 2:
			investimentFunds();
			break;
			
		default: 
			System.out.println("Op��o inv�lida");
		}
		input.close();
	}
	
	public static void directTreasure() {
		System.out.println("Informe o valor que ser� investido : ");
		Scanner input = new Scanner(System.in);
		double value = input.nextDouble();
		input.close();
		double investedAmount = value * 1.08;
		System.out.println("Em um ano o valor investido ter� rendido R$" + investedAmount);
		System.out.println("Aperte 1 para voltar ao menu principal ");
		
		
	}
	
	public static void investimentFunds() {
		System.out.println("Informe o valor que ser� investido: ");
		Scanner input = new Scanner(System.in);
		double value = input.nextDouble();
		input.close();
		double investedAmount = value * 1.09;
		System.out.println("Em um ano o valor investido ter� rendido R$" + investedAmount);
		
	}
		
}	
	
