package collectionDemos;

import java.awt.List;
import java.util.ArrayList;

public class ListDemo3 
{

	public static void main(String[] args)
	{
		ArrayList<String> list =  new ArrayList<String>();
		list.add("RBg technologies");
		list.add("selenium");
		list.add("Java");

		int listSize = list.size();
		System.out.println("listSize:+listSize");

				 
		list.add("RBg technologies");
		list.add("selenium");
		list.add("Java");

		int listSize1 = list.size();
		System.out.println("listSize:+listSize");

	}

}
