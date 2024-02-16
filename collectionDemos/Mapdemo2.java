package collectionDemos;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo2 

{

	public static void main(String[] args) 
	{
		Map<String,String> map1 = new HashMap<String,String>();

		map1.put("phone"," 99638567862");
		map1.put("name","RBG technologies");

		int mapsize = map1.size();
		System.out.println("mapsize:+mapsize");

		map1.put("phone","8885057246");
		map1.put("nmae"," RBG technologies");
		map1.put("API Testing", "RestAssured");

		mapsize = map1.size();
		System.out.println("mapsize:+mapsize");

	}

}