package Package4;

import Package3.ParentAbstratClass;

public class ChildAbstractClassDiffPackage extends ParentAbstratClass{
	
	
	
	public static void main(String[] args)
	{
		ChildAbstractClassDiffPackage c =new ChildAbstractClassDiffPackage();
		//ParentAbstratClass pt =new ParentAbstratClass();
		//cannot create object of abstract class
		
		c.Engine();
		c.safetyWindow();
		c.PlaneFan();
		
		c.Flightcolour();
		c.logo();
		c.FlightName();
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
		System.out.println("FFlight colour for indigo is yellow");
		
	}

}
