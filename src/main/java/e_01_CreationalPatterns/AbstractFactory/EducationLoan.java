package e_01_CreationalPatterns.AbstractFactory;

public class EducationLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		this.rate = 0.5 * rate;	
	}
	
}
