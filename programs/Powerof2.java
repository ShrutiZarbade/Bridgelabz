package programs;

public class Powerof2
{

	public static void main(String[] args) 
	{
		int num=1;
		if(num>31)
		{
			System.out.println("No is greater than 31:");
		}
		else 
		{
			for(int i=0;i<num;i++)
			{
				num=num*2;
				System.out.println(num);
			}
				
		}

	}

}
