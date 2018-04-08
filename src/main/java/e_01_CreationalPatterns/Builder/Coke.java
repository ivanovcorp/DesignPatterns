package e_01_CreationalPatterns.Builder;

public abstract class Coke extends ColdDrink {

	public abstract String name();

	public abstract String size();

	@Override
	public abstract float price();

}
