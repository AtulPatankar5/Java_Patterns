package Logical;

import java.util.Scanner;

public class PrimeNumber {

	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num= sc.nextInt();
		
		int count =0;
		for(int i=1; i<=num;i++)
		{
			
			if(num%i==0)
			{
				count ++;
				
			}
			
		}
		System.out.println("factors="+count);
		
		if (count==2)
		{
			System.out.println("prime number");
		}
		
			else
			{
				System.out.println("not prime");
			}
			
			
		
		
	}

}
