package Package4;

import Package3.ParentInterface;

public class ChildInterfaceDiffPackage implements ParentInterface,Interface{
	
	
	
	public static void main(String[] args) {
		ChildInterfaceDiffPackage c = new ChildInterfaceDiffPackage();
		ParentInterface pt = new ChildInterfaceDiffPackage();
		Interface it = new ChildInterfaceDiffPackage();
		//ParentInterface pt =new ParentInterface();
		//cannot create object of abstract class
		c.walkway();
		
		pt.GREEN();
		pt.YELLOW();
		pt.RED();
		
		it.anotherchildClass();
		
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

	@Override
	public void anotherchildClass() {
		System.out.println("same package another interface");
		
	}

}
