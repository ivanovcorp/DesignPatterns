package e_01_CreationalPatterns.AbstractFactory;

public class HSBC extends AbstractBank {
	
	public HSBC() {
		this("HSBC");
	}
	
	private HSBC(String bankName) {
		super(bankName);
	}
}
