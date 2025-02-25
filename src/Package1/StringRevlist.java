package Package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringRevlist {
	
	    public static void main(String[] args) {
	        String inputString = "hello";
	        
	        // Step 1: Convert the string to a list of characters
	        List<Character> charList = new ArrayList<>();
	        for (int i = 0; i < inputString.length(); i++) {
	            charList.add(inputString.charAt(i));
	        }
	        
	        // Step 2: Reverse the list using Collections.reverse()
	        Collections.reverse(charList);
	        
	        // Step 3: Convert the list back into a string
	        StringBuilder reversedString = new StringBuilder();
	        for (char ch : charList) {
	            reversedString.append(ch);
	        }
	        
	        // Output the reversed string
	        System.out.println("Reversed String: " + reversedString.toString());
	    }
	}


