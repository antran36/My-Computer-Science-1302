/**
	This program check if one string is reverse of another
	@param 2 String
	@return boolean True or False
*/
public class recursionExcercises12
{
	public static void main(String[] args)
	{
	
		if(isReverse("Hello","olLeh"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	/**
		This method check if one stirng is reverse of another
		@param 2 string
		@return boolean
	*/
	public static boolean isReverse(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		s1= s1.toLowerCase();
		s2= s2.toLowerCase();
		if(s1.length() ==0 || s1.length()==1)
		{
			return true;
		}

		if(s1 =="")
			{
				return true;
			}
		else 
		{
			if(s1.charAt(0) != s2.charAt((s2.length()-1)))
			{
				return false;
			}
			isReverse(s1.substring(1),s2.substring(0,s2.length()-1));
			return true;
		}	
	}
}
