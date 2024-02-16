package collectionDemos;

import java.util.ArrayList;
import java.util.List;


public class ListDemo4 
{

	public static void main(String[] args) 
	{
		List<String>list1 = new ArrayList<String>();
		list1.add("RBg tchnologies");
		list1.add("Java");
		list1.add("Selenium");
		String FirstElement= list1.get(0);
		System.out.println(FirstElement);
	}

}
