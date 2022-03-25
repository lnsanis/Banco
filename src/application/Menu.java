//Menu principal do DEVinMoney

package application;

import java.util.Scanner;
import db.AccountTable;
import functions.AccountNumberGenerator;
import functions.CpfValidate;
import register.BankAccount;

public class Menu {

	public static void menu() {
		
		System.out.println("           **Bem Vindo ao Bank Money**\n");
		System.out.println("                 Como podemos ajudar?\n\n");
		System.out.println("Se quiser acessar sua conta aperte 1");
		System.out.println("Se desejar realizar o cadastro de conta em nosso banco aperte 2");
		
		int option;
		Scanner input = new Scanner(System.in);
			option = input.nextInt();
			input.close();
			switch(option) {
			case 1:
				accessAccount();
				break;
				
			case 2: 
				registerAccount();
				break;
				
			default:
				System.out.println("Opção inválida");
				menu();
			}
		
	} 
	
	public static void accessAccount() {
		
		System.out.println("Informe o número da conta por favor: ");
		Scanner input = new Scanner(System.in);
		int numAccount = input.nextInt();
		BankAccount account = AccountTable.getAccountByAccountNumber(numAccount);
		
		
		System.out.println("Bem-vindo\n");
		System.out.println("Selecione uma opção:\n");
		System.out.println("Opção 1 - Depositar");
		System.out.println("Opção 2 - Sacar");
		System.out.println("Opção 3 - Saldo da conata");
		System.out.println("Opção 4 - Transferir");
		
		int option = input.nextInt();
		switch(option) {
		case 1:
			account.deposit();
			break;
			
		case 2:
			account.withdraw();
			break;
		case 3:
			account.getBalance();
			break;
		case 4:
			account.transfer(account, option);
			break;
			
		default: 
			System.out.println("Opção inválida");
		}
		input.close();
	}
//Criação de conta nova	
	public static void registerAccount() {
		
		Scanner account = new Scanner(System.in);	
		
		System.out.println("Digite seu nome:");
		String name = account.next();

		//Usando a validação do CPF
		System.out.println("Digite seu CPF:");
		String cpf = account.nextLine();
		if (CpfValidate.isCPF(cpf) == true)
			System.out.printf("%s\n", CpfValidate.printsCPF(cpf));
		else System.out.printf("CPF invalido\n");
		
		System.out.println("Informe sua renda mensal: ");
		double monthlyIncome = account.nextDouble();
		
		int accountNumber = AccountNumberGenerator.getNextNumber();
		System.out.println("\nO número da sua conta será: " + accountNumber);
		System.out.println();
		System.out.println("Selecione uma agência");
		System.out.println("001 - Florianópolis");
		System.out.println("002 - São José");
		int agency = account.nextInt();
		
		BankAccount user = new BankAccount(name, cpf, monthlyIncome, accountNumber, agency);
		
		System.out.println("**Dados da conta:**");
		System.out.println(user.getNameClient() + "\n" + user.getAccountNumber() + "\n" + user.getAgency() + "\n" + user.getMonthlyIncome());
		account.close();
		menu();
	}
		public static void main(String[] args) {
			menu();
		}
}
