package Package2;

public class ArrayBoundary {
public static void main(String[] args)
{
	 int[] emptyArray = {};
     int[] singleElementArray = {10};
     int[] allIdenticalArray = {5, 5, 5, 5};
     int[] normalArray = {1, 2, 3, 4, 5};

     // Testing the arrays
     System.out.println("Testing empty array:");
     testArray(emptyArray);

     System.out.println("\nTesting single-element array:");
     testArray(singleElementArray);

     System.out.println("\nTesting all identical elements array:");
     testArray(allIdenticalArray);

     System.out.println("\nTesting normal array:");
     testArray(normalArray);
 }

 public static void testArray(int[] arr) {
     // Test for empty array
     if (arr.length == 0) {
         System.out.println("Array is empty.");
         return;
     }

     // Test for single-element array
     if (arr.length == 1) {
         System.out.println("Array has one element: " + arr[0]);
         return;
     }

     // Test for all identical elements
     boolean allIdentical = true;
     for (int i = 1; i < arr.length; i++) {
         if (arr[i] != arr[0]) {
             allIdentical = false;
             break;
         }
     }

     if (allIdentical) {
         System.out.println("Array contains all identical elements.");
     } else {
         System.out.println("Array has different elements.");
     }

     // Additional test: Print first and last element of the array
     System.out.println("First element: " + arr[0] + ", Last element: " + arr[arr.length - 1]);
 }
}
