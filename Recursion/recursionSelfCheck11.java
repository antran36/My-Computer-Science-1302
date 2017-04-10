/**
	This program print out the power of a number 
	@param int x, int y
	@return x to the yth
*/
public class recursionSelfCheck11
{
	public static void main(String[] args)
	{
		System.out.print(pow(2,5));
	}
	public static int pow(int x, int y)
	{
		if(y==1)
		{
			return x;
		}
		else
		{
			return x* pow(x,y-1);
		}
	}
}

