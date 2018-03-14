package DesignPatterns;

public class Factory {
public static void main(String[] args) {
	PlanFactory obj= new PlanFactory();
	Plan p=obj.getPlan("Domestic");
	p.rate=p.getRate();
	p.calculateBill(100);
}
}


abstract class Plan{
	protected double rate;
	abstract double getRate();
	public void calculateBill(int units) {
		System.out.println("Bill amount"+rate*units);
	}
	
}

class DomesticPlan extends Plan{

	@Override
	double getRate() {
		// TODO Auto-generated method stub
		return 2.5;
	}
	
}

class CommercialPlan extends Plan{

	@Override
	double getRate() {
		// TODO Auto-generated method stub
		return 4.5;
	}
	
}

class InstitutionalPlan extends Plan{

	@Override
	double getRate() {
		// TODO Auto-generated method stub
		return 6.5;
	}
	
}

class PlanFactory{
	private Plan plan;
	public Plan getPlan(String s) {
		switch(s) {
		case "Domestic": return new DomesticPlan();
		case "Institutional": return new DomesticPlan();
		case "Commercial": return new DomesticPlan();
		default: return null;
		}
	}
}

