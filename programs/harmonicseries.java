package programs;

import java.util.Scanner;

public class harmonicseries 
{

	public static void main(String[] args) 
	{
                                                                                                                                     		float h=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		float n=sc.nextInt();
		for(int i =2;i<n;i++)
		{
			h+=(float)1/i;
		}
		System.out.println(h);
		
	}

}

// TODO Auto-generated method stub
