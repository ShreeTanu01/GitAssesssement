package Package2;

import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList {

	
//	public void reverse(ArrayList <String> list )
//	Collections.reverse(list);
//		
//	}
//	
	
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("one");
		arr.add("two");
		arr.add("three");
		System.out.println(arr);
		Collections.reverse(arr);
		System.out.println(arr);
		
	}
}
