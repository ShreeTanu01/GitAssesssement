package Package1;

public class PrimeNumber {
	
	
	/// Correct but loop will run multiple times even after temp>0
	public void PrimeNumCheck(int num) {
		//smallest prime num is 2
		// 5%i = 0 ; then not prime
		int temp=0;
		
		if (num <= 1) {
            System.out.println("It is not Prime");
            return;
        }
		
		for(int i=2 ;i<num;i++)
		{
		    if( num % i == 0 )
		    {
		    	 temp ++;
		    }
		    
		}
		if(temp>0) {
			System.out.println("It is not Prime");
		}
		else
		{
			System.out.println("It is Prime");
		}
	}
	
	
	//******************************************************************************
		//Optimize way beark code once temp >0 ,It won't take time for big numbers


	public void PrimeNum(int num) {
        // Handle edge case for numbers <= 1
        if (num <= 1) {
            System.out.println("It is not Prime");
            return;
        }
        
        // Loop from 2 to sqrt(num) to check divisibility
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("It is not Prime");
                return;  // Exit the method as we found a divisor
            }
        }
        
        // If no divisor was found, it is prime
        System.out.println("It is Prime");
    }
	
	public static void main(String[] args) {
		PrimeNumber PN = new PrimeNumber();
		PN.PrimeNumCheck(1); 
		PrimeNumber PN1 = new PrimeNumber();
		PN1.PrimeNumCheck(10); 
        PrimeNumber PN2 = new PrimeNumber();
		PN2.PrimeNumCheck(7); 
		
		PrimeNumber PNO = new PrimeNumber();
		PNO.PrimeNum(1); 
		PrimeNumber PNO1 = new PrimeNumber();
		PNO1.PrimeNum(10); 
        PrimeNumber PNO2 = new PrimeNumber();
		PNO2.PrimeNum(7); 
		
	}

}
