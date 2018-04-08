package e_01_CreationalPatterns.Builder;

public abstract class VegPizza extends Pizza {

	@Override
	public abstract float price();

	public abstract String name();

	public abstract String size();
}
