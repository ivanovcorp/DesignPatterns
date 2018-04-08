package e_01_CreationalPatterns.Factory;

public class GetPlanFactory {
	public static enum Plans {
		DOMESTIC_PLAN, COMMERCIAL_PLAN, INSTITUTIONAL_PLAN
	}

	public static Plan getPlan(Plans plan) {

		switch (plan) {
		case DOMESTIC_PLAN:
			return new DomesticPlan();
		case COMMERCIAL_PLAN:
			return new CommercialPlan();
		case INSTITUTIONAL_PLAN:
			return new InstitutionalPlan();
		default:
			return null;
		}		
	}
}
