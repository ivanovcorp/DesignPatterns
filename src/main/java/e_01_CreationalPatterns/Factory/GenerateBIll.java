package e_01_CreationalPatterns.Factory;

import java.util.Scanner;

import e_01_CreationalPatterns.Factory.GetPlanFactory.Plans;

public class GenerateBIll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select which bill you want to generate(press 1-3): ");
		System.out.println("1. Domestic\n2. Commercial\n3. Institutional");
		int usrInput = sc.nextInt();
		System.out.println("Enter the number of units: ");
		int units = sc.nextInt();
		Plan usrPlan = null;
		String plan = "";
		switch (usrInput) {
		case 1:
			usrPlan = GetPlanFactory.getPlan(Plans.DOMESTIC_PLAN);
			plan = Plans.DOMESTIC_PLAN.name();
			break;
		case 2:
			usrPlan = GetPlanFactory.getPlan(Plans.COMMERCIAL_PLAN);
			plan = Plans.COMMERCIAL_PLAN.name();
			break;
		case 3:
			usrPlan = GetPlanFactory.getPlan(Plans.INSTITUTIONAL_PLAN);
			plan = Plans.INSTITUTIONAL_PLAN.name();
			break;		
		}
		
		System.out.println("Bill amount for " + plan + " of " + units + " units is: ");
		usrPlan.getRate();
		usrPlan.calculateRate(units);
	}
}
