package e_01_CreationalPatterns.Factory;

public abstract class Plan {
	
	protected double rate;
	
	abstract void getRate();
	
	public void calculateRate(int units) {
		System.out.println(units * this.rate);
	}
}
