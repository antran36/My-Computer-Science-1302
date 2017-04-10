/*input
8
*/
/**
This program print out the symmetric sequence of number
@param integer
@return symmetric sequence of number
*/
import java.util.Scanner;
public class recursionExercises3
{
public static int k=1;

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in); 
		int n=scan.nextInt();
		System.out.println("The number is " + n);
		if(n<1) throw new IllegalArgumentException("Your number is not valid");
		writeSequence(n);
	
	}
	/**
		 The method print out the symmetric sequence
	*/
	public static void writeSequence(int n)
	{
		int half = n/2;
		if(n==1)
		{
			System.out.print(1);
		}
		else if(n%2==0)
		{
			printDescendingEven(half);
			System.out.print(" ");
			printAscending(half);
			
		}
		else
		{
			printDescendingOdd(half+1);
			System.out.print(" ");
			printAscending(half+1);
		}
		System.out.println();
	}
	/**
		Print descending array of an even number
	*/
	public static void printDescendingEven(int n)
	{
		{
			if(n== 1)
			{
				System.out.print(1);
			}
			else
			{
				System.out.print(n +" ");
				printDescendingEven(n-1);
			}
		}

	}
	/**
		Print descending array of an odd number
	*/
	public static void printDescendingOdd(int n)
	{
		{
			if(n== 2)
			{
				System.out.print(2);
			}
			else
			{
				System.out.print(n +" ");
				printDescendingOdd(n-1);
			}
	}
		
	}
	/**
		Print ascending array of any number
	*/
	public static void printAscending(int n)
	{
		{
			if(n>0)
			{
			int k =n;
			printAscending(n-1);	
			System.out.print(k+ " ");
	}
		
	}
}
}




