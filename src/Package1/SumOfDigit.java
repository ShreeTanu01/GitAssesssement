package Package1;

public class SumOfDigit {
	
	public int SUMDigits(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum = num%10 + sum;
			num=num/10;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		int number = 12345;
		int result=0;
		SumOfDigit s = new SumOfDigit();
		result = s.SUMDigits(number);
		System.out.println("Sum of digits " + number +" is : " + result );
		
	}
	

}
