package e_01_CreationalPatterns.AbstractFactory;

public class UniCredit extends AbstractBank {

	public UniCredit() {
		this("UniCredit");
	}
	
	private UniCredit(String bankName) {
		super(bankName);	
	}

}
