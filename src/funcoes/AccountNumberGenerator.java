package funcoes;

public class AccountNumberGenerator {

	private static int ID = 1;
	
	public static int getNextNumber() {
		return ID++;
	}
	
}
