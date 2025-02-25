package Package1;

import java.util.Scanner;

public class swaptwoNumber {

	
	public static void main(String[] args) {
		
		/****************************** SWAP using 3 variables*********************************/
		/*
		int num1=0;
		int num2=0;
		int temp=0;
		System.out.println("Enter int 1 :");
		Scanner sc1= new Scanner(System.in);
		num1 = sc1.nextInt();
		System.out.println("Enter int 2 :");
		Scanner sc2= new Scanner(System.in);
		num2 = sc2.nextInt();
		System.out.println("Num 1 :"+num1);
		System.out.println("Num 2 :"+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Num 1 :"+num1);
		System.out.println("Num 2 :"+num2);
		sc1.close();
		sc2.close();
		*/
		
		/****************************** SWAP using 2 variables*********************************/
		int num1=0;
		int num2=0;
		System.out.println("Enter int 1 :");
		Scanner sc1= new Scanner(System.in);
		num1 = sc1.nextInt();
		System.out.println("Enter int 2 :");
		Scanner sc2= new Scanner(System.in);
		num2 = sc2.nextInt();
		System.out.println("Num 1 :"+num1);
		System.out.println("Num 2 :"+num2);
		num1 = num1-num2;//10-2=8
		num2=num1+num2;//8+2=10
		num1=num2-num1;
		System.out.println("Num 1 :"+num1);
		System.out.println("Num 2 :"+num2);
		sc1.close();
		sc2.close();
		
		
	}
}
