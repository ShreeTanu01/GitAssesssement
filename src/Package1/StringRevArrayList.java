package Package1;

import java.util.ArrayList;

public class StringRevArrayList {

	public static void main(String[] args) {
        // Create an ArrayList and add some strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        
        System.out.println("Original ArrayList: " + stringList);
        
        // Reverse the strings in the ArrayList
        for (int i = 0; i < stringList.size(); i++) {
            String original = stringList.get(i);
            String reversed = new StringBuilder(original).reverse().toString();
            stringList.set(i, reversed);  // Set the reversed string back in the list
        }
        
        // Output the result
        System.out.println("Reversed ArrayList: " + stringList);
    }
}
