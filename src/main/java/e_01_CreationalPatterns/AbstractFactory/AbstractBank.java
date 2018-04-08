package e_01_CreationalPatterns.AbstractFactory;

public class AbstractBank implements Bank {
	
	private String bankName;
	
	protected AbstractBank(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankName() {
		return this.bankName;
	}
}
