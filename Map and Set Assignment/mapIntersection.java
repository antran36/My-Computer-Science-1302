/**
	This program is used to find the same value of 2 sets
	@param 2 sets
	@return newSet
*/
import java.util.*;
public class mapIntersection
{
	public static void main(String[] args)
	{
		Map<String, Double> map1 = new HashMap<String,Double>();
		Map<String, Double> map2 = new HashMap<String,Double>();
		map1.put("Janet",87.0);
		map1.put("Logan",62.0);
		map1.put("Whitaker",46.0);
		map1.put("Alyssa",100.0);
		map1.put("Stefanie",80.0);
		map1.put("Jeff",88.0);
		map1.put("Kim",52.0);
		map1.put("Sylvia",95.0);

		map2.put("Brian",60.0);
		map2.put("Logan",62.0);
		map2.put("Whitaker",52.0);
		map2.put("Lisa",100.0);
		map2.put("Stefanie",80.0);
		map2.put("Jeff",88.0);
		map2.put("Kim",52.0);
		map2.put("Sylvia",87.0);
		System.out.println(intersect(map1,map2));

	}
	/**
	This method find the intersection between 2 sets
	*/
	public static Map<String, Double> intersect (Map<String, Double> map1, Map<String, Double> map2 )
	{
		Map<String, Double> newMap = new HashMap<String,Double>();
		Set<String> keyset = new HashSet<String>();
		keyset= map1.keySet();
		Iterator<String> iter = keyset.iterator();
		while(iter.hasNext())
		{
			String name = iter.next();
			if(map2.containsKey(name))
			{
				if(map1.get(name).equals(map2.get(name)))
				{
					newMap.put(name,map1.get(name));
				}
			}
		}
		return newMap;

	}
}