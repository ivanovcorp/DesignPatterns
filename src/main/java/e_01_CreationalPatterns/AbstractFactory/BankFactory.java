package e_01_CreationalPatterns.AbstractFactory;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}
		if (bank.equalsIgnoreCase("HSBC")) {
			return new HSBC();
		} else if (bank.equalsIgnoreCase("Allianz")) {
			return new Allianz();
		} else if (bank.equalsIgnoreCase("UniCredit")) {
			return new UniCredit();
		}
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}

}
