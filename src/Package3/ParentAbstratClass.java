package Package3;


//aeeroplane flights
public abstract class ParentAbstratClass {

	
	
	public void Engine() {System.out.println("Engine is common for all flight");};
	public void PlaneFan() {System.out.println("PlaneFan is common for all flight");};
	protected void safetyWindow() {System.out.println("SafetyWindow is common for all flight");};
	
	protected abstract void logo();
	public abstract void FlightName();
	public abstract void Flightcolour();
	
	
}
