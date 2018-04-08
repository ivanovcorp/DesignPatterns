package e_02_StructuralPatterns.Adapter;

public class Demo {

	public static void main(String[] args) {
		CreditCard targetInterface = new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.print(targetInterface.getCreditCard());
	}

}
