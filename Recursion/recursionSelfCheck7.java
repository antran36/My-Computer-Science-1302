/**
	This program print reverse string with double word
	@param String
	@return String reversed
*/
public class recursionSelfCheck7
{
	public static int i=0;
	public static void main(String[] args)
	{
			doubleReverse("hello");
	}
	/**
	This method print the String in reverse with double word
	*/
	public static void doubleReverse(String s)
	{
		if(i< s.length())
			
		{

				char word= s.charAt(i);
				i++;
				doubleReverse(s);
				System.out.print(word);
				System.out.print(word);
		}
	}
}