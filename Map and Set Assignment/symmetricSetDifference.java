import java.util.*;
/**
	print symmetric difference of two set
	@param 2 Hashset
	@return Hashset
*/
public class symmetricSetDifference
{
	public static void main(String[] args)
	{
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(2);
		set1.add(7);
		set1.add(8);
		set1.add(10);
		set1.add(12);
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(10);
		set2.add(12);
		set2.add(20);
		set1.add(24);
		set1.add(25);
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(symmetricSetDifference(set1,set2));

	}
	/**
	This method returns the symmetricdifference of 2 sets
	*/
	public static Set<Integer> symmetricSetDifference(HashSet<Integer> set1, HashSet<Integer> set2)
	{
		Set<Integer> newSet = new HashSet<Integer>();
		newSet.addAll(set2);
		newSet.addAll(set1);
		Set<Integer> unionSet = new HashSet<Integer>();
		unionSet.addAll(set1);
		unionSet.retainAll(set2);
		newSet.removeAll(unionSet);
		return newSet;
	}
}
