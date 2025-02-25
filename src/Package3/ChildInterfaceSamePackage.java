package Package3;

public class ChildInterfaceSamePackage implements ParentInterface{
	
	
	
	public static void main(String[] args) {
		ChildInterfaceSamePackage c = new ChildInterfaceSamePackage();
		ParentInterface pt = new ChildInterfaceSamePackage();
		//ParentInterface pt =new ParentInterface();
		//cannot create object of abstract class
		c.walkway();
		
		pt.GREEN();
		pt.YELLOW();
		pt.RED();
	}
	
	public void walkway() {
		System.out.println("walk way is of this class");
	}

	@Override
	public void RED() {
		System.out.println("RED means STOP");
		
	}

	@Override
	public void YELLOW() {
		System.out.println("YELLOW means WAIT");
		
	}

	@Override
	public void GREEN() {
		System.out.println("Green means GO");
		
	}

}
