package Package3;

public class ChildAbstractClassSamePackage extends ParentAbstratClass{
	public static void main(String[] args) {
	ChildAbstractClassSamePackage c= new ChildAbstractClassSamePackage();
	//ParentAbstratClass pt = new ParentAbstratClass(); 
	//cannot create object of abstract class
	c.Engine();
	c.PlaneFan();
	c.safetyWindow();
	
	c.FlightName();
    c.Flightcolour();
    c.logo();
	
	}

	@Override
	public void logo() {
		System.out.println("Indigo logo");
		
	}

	@Override
	public void FlightName() {
		System.out.println("Fight Name is indigo");
	}

	@Override
	public void Flightcolour() {
		System.out.println("Flight color for indigo is white");
		
	}
    
}
