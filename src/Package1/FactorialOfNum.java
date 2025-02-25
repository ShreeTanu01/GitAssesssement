package Package1;

public class FactorialOfNum {
	
	
	//4=4*3*2*1
	//  n-0* n-1 * n
	
	//normal code
	public int Factorial(int num)
	{
		int result =1;
		for(int i=1;i<=num;i++)
		{
			result = result* i; ;
		}
		return result;
	}
	
	//using rescurssion
	public static int FactorialRecurrsion(int num)
	{
		
		return (num == 1 || num == 0) ? 1: num * FactorialRecurrsion(num - 1);  
	}
	
	public static void main(String[] args) {
		int Result = 0;
		int resrrec = 0;
		FactorialOfNum F = new FactorialOfNum();
		Result = F.Factorial(3);
		System.out.println("Factorial (Normal method ) value is : " + Result );
		
		FactorialOfNum FR = new FactorialOfNum();
		resrrec =  FR.FactorialRecurrsion(3);
		System.out.println("Factorial (Recursion method ) value is : " + resrrec );
		
	}

}
