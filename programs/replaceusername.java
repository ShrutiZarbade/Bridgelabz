package programs;

import java.util.Scanner;

public class replaceusername 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a name:");
		String name=sc.nextLine();

		int len=name.length();
		if(len>=3)
		{
			System.out.println("hello "+name+",How are you?");
		}
		else
		{
			System.out.println("string is less than 3 character");
		}
	}
}
