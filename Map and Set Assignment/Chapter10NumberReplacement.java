/*input
2
3
4
*/
import java.util.ArrayList;
import java.util.Scanner;
/**
 The program add the amount of number with exact value of that number at given position
 @param listlength, listarray
 @return list
 */
public class Chapter10NumberReplacement
{
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();
	System.out.print("How many numbers you have? \n");
	int s = scan.nextInt();
	scan.nextLine();
	for(int i=0; i<s ; i++)
	{
		System.out.print("Please input your number: \n");
		list.add(scan.nextInt());
		
	}
		scalebyK(list);
		System.out.print(list);
}
    /**
     The method add the amount of number with exact value of that number at given position
     @param list
     */
public static void scalebyK(ArrayList<Integer> list)
{
	for(int i=list.size()-1; i>-1; i--)

	{
		int element = list.get(i);
		for(int j=0; j<element-1;j++)
		{
			list.add(i,element);
		}
	}
}
}