package Package1;

import java.util.Scanner;

//import com.sun.tools.javac.util.Pair;

public  class ReverseString {
	public static String input() {
		System.out.println("Enter string you want to reverse : ");
		Scanner sc= new Scanner(System.in);
		 String ori = sc.next();
		return ori;
		
		}
	public static String output()
	{
		String rev ="";
		String org = "";
		org=input();
		int orgLen = org.length();
		 
		for(int i=orgLen-1; i>=0;i--)
		{
			 rev = rev+org.charAt(i);
		}
		return rev;
	}
	 
	public static void main(String[] args) 
	{
	   ///////////////////////////////////////////////////Direct/////////////////////////////////////////////////////
	/*	String str = "" ;
		String rev ="";
		System.out.println("Enter string you want to reverse : ");
		Scanner sc= new Scanner(System.in);
		 String original = sc.nextLine();
		 int orgLen = original.length();
		 
			for(int i=orgLen-1; i>=0;i--)
			{
				 rev = rev+original.charAt(i);
			}
		System.out.println("Original String : "+original);
		System.out.println("Reverse String  : "+rev);*/
		
		
///////////////////////////////////////////////////method/////////////////////////////////////////////////////
		
		//input();
		String reversed ="";
		String original ="";
		reversed = output();
		original = input();
		System.out.println("Original String : "+original);
		System.out.println("Reverse String  : "+reversed );
		
	}
	

}
