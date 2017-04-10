/**
	The program print out the factorial of a number
	@param integer
	@return factorial
*/
public class recursionSelfCheck16
{
	public static void main(String[] args)
	{
		System.out.println(factorial(5));
	}
	public static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n* factorial(n-1);
		}
	}
}

