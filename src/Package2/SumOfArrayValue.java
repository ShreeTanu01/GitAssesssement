package Package2;

public class SumOfArrayValue {

	public int SumArray(int[] arr)
	{
		int size = arr.length;
		int sum=0;
		for (int i=0;i<size;i++)
		{
			 sum = sum + arr[i];
		}
		return sum;
	}
	
	//1,2,3
	//arr[1];arr[2];arr[3]
	
	public static void main(String[] args)
	{
		int[] array = new int[] {1,2,3,4,5};
		SumOfArrayValue methodOFSUM = new SumOfArrayValue();
		int result = methodOFSUM.SumArray(array);
		System.out.println("Result of : " +array[0]+array[1]+array[2]+array[3]+array[4]+ "is " + result );
		
	}
}
