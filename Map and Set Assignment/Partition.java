/**
rearrages the list so that all elements with value less than a given number is before the list
@param an integer and a list
@return arranged list
*/
import java.util.*;
public class Partition
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println("Type in the any number: ");
		int number = scan.nextInt();
		System.out.println("Type in the list of integers: ");
		list.add(scan.nextInt());
		while(scan.hasNextInt())
		{
		list.add(scan.nextInt());
	
		}
		
		System.out.println(	Partition(list,number));

	}	
/**
	arrange the list so that all the value smaller than the number is before the number
*/
	public static LinkedList<Integer> Partition( LinkedList<Integer> list, int number )
	{
		LinkedList<Integer> aList  = new LinkedList<Integer>();
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext())
		{
			int n = iter.next();
			if(n> number)
			{
				aList.addLast(n);
			}
			else
			{
				aList.addFirst(n);
			}

		}	
		return aList;
	}
	
}