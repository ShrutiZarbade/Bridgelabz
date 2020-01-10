package programs;

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%2==0)
			{
				
				System.out.println("is not a prime number ");
				
			}
			else 
			{
				
				System.out.println(" is a prime number");
			}
		
		}
	}

}
