package collectionDemos;

import java.util.ArrayList;
import java.util.List;


public class Listdemo4A 
{

	public static void main(String[] args) 
	{
		List<String>list1 = new ArrayList<String>();
		list1.add("RBg tchnologies");
		String stringData = list1.get(0);


		List<Integer>List2 = new ArrayList<Integer>();
		List2.add(10);
		Integer intdata = List2.get(0);


		List<Boolean>List3 = new ArrayList<Boolean>();
		List3.add(true);
		Boolean booleandata = List3.get(0);


	}
}