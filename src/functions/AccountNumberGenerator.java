//Classe para poder gerar os n�meros das contas que s�o cadastradas no sistema automaticamente

package functions;

public class AccountNumberGenerator {

	private static int ID = 1;
	
	public static int getNextNumber() {
		return ID++;
	}
	
}
