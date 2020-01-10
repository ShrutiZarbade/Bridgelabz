package Functionalprograms;

import java.util.Scanner;

public class Tw0_DArray 
{
	public static void main(String[] args) 
	{
		int arr[][]=new int [10][10];
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a row:");
		int row = sc.nextInt();
		System.out.print("Enter a column:");
		int col = sc.nextInt();
		System.out.println("Enter "+(row*col)+" array element");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]= sc.nextInt();
				
			}
		}
		
	       System.out.print("The Array is :\n");
	       for(int i=0; i<row; i++)
	       {
	           for(int j=0; j<col; j++)
	           {
	               System.out.print(arr[i][j]+ "  ");
	           }
	           System.out.println();
	       }
		
	}
}
