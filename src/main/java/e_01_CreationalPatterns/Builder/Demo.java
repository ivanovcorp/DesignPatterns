package e_01_CreationalPatterns.Builder;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		OrderBuilder builder = new OrderBuilder();

		OrderedItems orderedItems = builder.preparePizza();

		orderedItems.showItems();

		System.out.println("\n");
		System.out.println("Total Cost : " + orderedItems.getCost());

	}

}
