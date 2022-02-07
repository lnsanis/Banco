package Register;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		System.out.println("Informe a quantidade de meses para simular: ");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		System.out.println("Informe o valor que irá depositar mensalmente: ");
		double value = input.nextDouble();
		input.close();
		
		double yield = value * 1.05;
		double valueOfMonth = yield + value;
		double simulatedValue = valueOfMonth * month;
		
		
		System.out.println(simulatedValue + "" + valueOfMonth + "" + yield);

	}

}
