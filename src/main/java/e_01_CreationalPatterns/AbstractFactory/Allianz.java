package e_01_CreationalPatterns.AbstractFactory;

public class Allianz extends AbstractBank {
	
	public Allianz() {
		this("Allianz");
	}
	
	private Allianz(String bankName) {
		super(bankName);		
	}	
}
