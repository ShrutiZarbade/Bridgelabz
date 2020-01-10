package programs;

import java.util.Scanner;

public class leapyear 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year :");
		int a=sc.nextInt();
		if((a%4==0&&a%100!=0)||(a%400==0))
		{
			System.out.println("Is a leap year");
			
		}
		else
		{
			System.out.println( "not a leap year");
		}

	}

}
