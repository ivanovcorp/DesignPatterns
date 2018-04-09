package e_02_StructuralPatterns.Proxy;

public class Demo {

	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternetAccess("Ivan Ivanov");
		access.grantInternetAccess();
	}

}
