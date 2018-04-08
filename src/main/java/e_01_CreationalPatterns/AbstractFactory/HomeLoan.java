package e_01_CreationalPatterns.AbstractFactory;

public class HomeLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		this.rate = rate;		
	}

}
