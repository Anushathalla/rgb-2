package collectionDemos;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 
{

	public static void main(String[] args) 
	{
		Map map =  new HashMap();
		map.put("phone, 9963856762", map);
		map.put("name", "RBG technologies");
		map.put("true","Done");

		Map<String,Integer> map1 = new HashMap<String,Integer>();
		map1.put("phone",99638567);
		
		
		Map<String,String> map2 = new HashMap<String,String>();
		map2.put("name","RBG technologies");
		
		
		Map<Boolean,String> map3 = new HashMap<Boolean,String>();
		map3.put(true,"Done");



	}
}