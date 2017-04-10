/*input
6
*/
/**
This program print out a Fibornacci number at a specific required position by a for loop and recursive method
@param int n
@return Fibornacci at nth position
*/
import java.util.Scanner;
public class Fibornacci
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the position of Fibornacci number you want to print out:");
		int n= scan.nextInt();
		long startTime1 = System.currentTimeMillis();
		System.out.print(recursiveFib(n));
		System.out.println();
		long endTime1 = System.currentTimeMillis();
		long totalTime1 = endTime1- startTime1;
		System.out.println(totalTime1);

		long startTime2 = System.currentTimeMillis();	
		System.out.print(forFib(n+2));
		System.out.println();
		long endTime2 = System.currentTimeMillis();
		long totalTime2 = endTime2- startTime2;
		System.out.println(totalTime2);
	}
	/**
		This method find the fibonarcci number at a given position by recurssion
	*/
	public static int recursiveFib(int n)
	{
		
			if(n==1)
		{	
			return recursiveFib(0);
		}
			if( n==0)
		{
			return 1;
		}
		else {
			
			return (recursiveFib(n-1) +recursiveFib(n-2));
			
		}
	}
	/**
		This method find the fibonarcci number at a given position by a for loop
	*/
	public static int forFib(int n)
	{
		if(n==1 || n==2)
		{
			return 1;
		}
		int sum=0, x1=1, x2=1;
		for(int i=2; i<= n-2; i++)
		{
			sum=x1+x2;
			x1=x2;
			x2=sum;
		}
		return sum;
	}

	
}

