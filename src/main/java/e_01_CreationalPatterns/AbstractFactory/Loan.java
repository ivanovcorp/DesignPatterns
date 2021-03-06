package e_01_CreationalPatterns.AbstractFactory;

public abstract class Loan {

	protected double rate;

	abstract void getInterestRate(double rate);

	public void calculateLoanPayment(double loanAmount, int years) {
		int n = years * 12;
		this.rate = rate / 1200;
		double EMI = ((this.rate * Math.pow(1 + this.rate, n)) / ((Math.pow(1 + this.rate, n)) - 1)) * loanAmount;
		System.out.println("Your monthly EMI is: " + EMI + " for the amount: " + loanAmount + " you have borrowed.");
	}
}
