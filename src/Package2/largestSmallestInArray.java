package Package2;

public class largestSmallestInArray {
	public static void main( String[] args) {
	
		
		//int[] arr = new int[] {1,2,3,4,5};
		int[] arr = new int[] {} ;//for empty string
		int sizeOfarr =arr.length;
		System.out.println("sizeOfarr "+sizeOfarr);
		if(sizeOfarr==0) {
			System.out.println(true);
			System.out.println("array is empty");
		
		}else {
			
			int largest = arr[0];
			int smallest =arr[0];
			for (int i = 0;i<sizeOfarr;i++) {
				if(arr[i]>largest) {largest=arr[i];}
				if(arr[i]<smallest) {smallest=arr[i];}
			}
			
			System.out.println("largest "+ largest);
			System.out.println("smallest "+ smallest);
			}

}}
