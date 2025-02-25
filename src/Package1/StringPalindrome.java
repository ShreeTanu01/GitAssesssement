package Package1;

import java.util.Scanner;

public class StringPalindrome extends ReverseString {
	
	
public static void main(String[] args) {
	String original = "" ;
	String rev ="";
	StringPalindrome y = new StringPalindrome();
	original =y.input();
	 StringPalindrome x= new StringPalindrome();
	 rev = x.output();
	 if(rev.equalsIgnoreCase(original)) {
		 System.out.println(original + " and " + rev+ " are Palindrome ");
	 }
	 else
	 {
		 System.out.println(original + " and " + rev+ " are not Palindrome ");
	 }
}

}
