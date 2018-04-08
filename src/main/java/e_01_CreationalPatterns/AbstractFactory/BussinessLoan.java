package e_01_CreationalPatterns.AbstractFactory;

public class BussinessLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		this.rate = 2 * rate;
	}
}
