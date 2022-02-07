package application;

import java.util.Scanner;

import Register.BankAccount;
import funcoes.AccountNumberGenerator;
import funcoes.CpfValidate;


public class Menu {

	public static void menu() {
		
		System.out.println("           **Bem Vindo ao Banco DevInMoney**\n");
		System.out.println("                 Como podemos ajudar?\n\n");
		System.out.println("Se quiser acessar sua conta aperte 1");
		System.out.println("Se desejar realizar o cadastro de conta em nosso banco aperte 2");
		
	}
	
	public static void accessAccount() {
		
	}
	
	public static void registerAccount() {
		
		Scanner account = new Scanner(System.in);	
		
		System.out.println("Digite seu nome:");
		String name = account.nextLine();
		
		System.out.println("Digite seu CPF:");
		String cpf = account.nextLine();
		if (CpfValidate.isCPF(cpf) == true)
			System.out.printf("%s\n", CpfValidate.imprimeCPF(cpf));
		else System.out.printf("CPF invalido\n");
		
		System.out.println("Informe sua renda mensal: ");
		double monthlyIncome = account.nextDouble();
		
		int accountNumber = AccountNumberGenerator.getNextNumber();
		System.out.println("O número da sua conta será: " + accountNumber);
		System.out.println();
		System.out.println("Selecione uma agência");
		System.out.println("001 - Florianópolis");
		System.out.println("002 - São José");
		int agency = account.nextInt();
		
		BankAccount user;
		
		user = new BankAccount(name, cpf, monthlyIncome, accountNumber, agency);
		
		
		
	}
		public static void main(String[] args) {
		int option;
		Scanner input = new Scanner(System.in);
		
		do {
			menu();
			option = input.nextInt();
			
			switch(option) {
			case 1:
				accessAccount();
				break;
				
			case 2: 
				registerAccount();
				break;
				
			default:
				System.out.println("Opção inválida");
			}
		} while(option != 0);
		input.close();
		} 
	}
