package Package1;

import java.util.Arrays;
import java.util.Scanner;

/*Two strings are said to be anagrams if they make a meaningful word by rearranging or 
 * shuffling the letters of the string. In other words, we can say that two strings are 
 * anagrams if they contain the same characters but in a different order. Note that a letter has to be used only once.
 * 
 * LISTEN - > SILENT
   HEART - > EARTH
   
 Removing whitespace and converting both strings to lowercase.
Checking if the lengths of the strings are the same.
Sorting the characters of both strings.
Comparing the sorted character arrays.
   
 * 
 * */
public class Anagram {
	
	  public static void main(String[] args) {
		  
		  String str1 = "";
		  String str2 = "";
		  System.out.println("Enter a word you want to check for anagramcheck1 :");
		  Scanner sc1 = new Scanner(System.in);
		  str1 = sc1.nextLine();
		  
		  System.out.println("Enter a word you want to check for anagramcheck2 :");
		  Scanner sc2 = new Scanner(System.in);
		  str2 = sc2.nextLine();
	    
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();

	    // check if length is same
	    if(str1.length() == str2.length()) {

	      // convert strings to char array
	      char[] charArray1 = str1.toCharArray();
	      char[] charArray2 = str2.toCharArray();

	      // sort the char array
	      Arrays.sort(charArray1);
	      Arrays.sort(charArray2);

	      // if sorted char arrays are same
	      // then the string is anagram
	      boolean result = Arrays.equals(charArray1, charArray2);

	      if(result) {
	        System.out.println(str1 + " and " + str2 + " are anagram.");
	      }
	      else {
	        System.out.println(str1 + " and " + str2 + " are not anagram.");
	      }
	    }
	    else {
	      System.out.println(str1 + " and " + str2 + " are not anagram.");
	    }
	  }
	
}
		  
	


