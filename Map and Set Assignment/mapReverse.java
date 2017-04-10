/**
	This program reverse a map by switching its key and values
	@param 2 set
	@return new reverse set
*/
import java.util.*;
public class mapReverse
{
	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<String,String>();
		map.put("42","Marty");
		map.put("81", "Sue");
		map.put("17", "Ed");
		map.put("31", "Dave");
		map.put("21", "Ed");
		map.put("3", "Marty");
		map.put("29", "Ed");
		System.out.println(reverse(map));


	}
	/**
	This method reverse 2 sets
	*/
	public static Map<String, HashSet<String>> reverse(Map<String,String> map)
	{
		Map<String, HashSet<String>> newMap = new HashMap<String, HashSet<String>>();
		Set<String> keySet = new HashSet<String>();
		keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext())
		{
			String key = iter.next();
			String name= map.get(key);
			if(!newMap.containsKey(name))
			{
				newMap.put(name, new HashSet<String>());
				newMap.get(name).add(key);
			}
			else
			{
				newMap.get(name).add(key);
			}
		}
		return newMap;
	}

}