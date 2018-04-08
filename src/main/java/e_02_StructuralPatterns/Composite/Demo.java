package e_02_StructuralPatterns.Composite;

public class Demo {

	public static void main(String args[]) {
		Employee emp1 = new Cashier(101, "Pesho Petrov", 20000.0);
		Employee emp2 = new Cashier(102, "Petq Georgieva", 25000.0);
		Employee emp3 = new Accountant(103, "Georgi Miladenov", 30000.0);
		Employee manager1 = new BankManager(100, "Ivan Ivanov", 100000.0);

		manager1.add(emp1);
		manager1.add(emp2);
		manager1.add(emp3);
		manager1.print();
	}
}
