package Functionalprograms;

public class Distance 
{

	public static void main(String[] args) 
	{
		int x1=Integer.parseInt(args[0]);
		int y1=Integer.parseInt(args[1]);
		int x2=Integer.parseInt(args[2]);
		int y2=Integer.parseInt(args[3]);
		System.out.println("x1="+x1 +" "+"x2="+x2);
		System.out.println("y1="+y1 +" "+"y2="+y2);
		
        double distance=Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        
        System.out.println("Distance between point(4,5)and(0,0)="+distance);
	}

}
