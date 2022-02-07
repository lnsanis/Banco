//Classe para poder gerar os números das contas que são cadastradas no sistema automaticamente

package functions;

public class AccountNumberGenerator {

	private static int ID = 1;
	
	public static int getNextNumber() {
		return ID++;
	}
	
}
