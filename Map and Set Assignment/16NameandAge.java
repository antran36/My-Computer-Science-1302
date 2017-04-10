/*
 * This program reads in name and age of people and put in a hash map.
 *@param
 *@return
*/
import java.util.*;
public class NameandAge
{
	public static void main(String[] args)
	{
	Map<String, Integer> NameandAge = new HashMap<String, Integer>();
	Scanner scan = new Scanner(System.in);
	System.out.println("Input number of people: ");
	int people = scan.nextInt();
	scan.nextLine();
	for(int i=0; i< people; i++)
	{
		System.out.print("Person name: ");
		String name = scan.nextLine();
		System.out.println();
		System.out.print("Person age: ");
		int age = scan.nextInt();
		scan.nextLine();
		NameandAge.put(name,age);
	}
}
	System.out.println(NameandAge);

}
