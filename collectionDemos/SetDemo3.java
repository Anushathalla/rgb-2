package collectionDemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo3 
{
	public static void main(String[] args) 
	{
		Set<String> set  = new HashSet<String>();
		set.add("RBG technologies");
		set.add("Java");
		set.add("selenium");

		Iterator<String> setlist = set.iterator();
		String firstElement = setlist.next();
		System.out.println("firstElement:+firstElement");

		String secondElement = setlist.next();
		System.out.println("secondElement:+secondElement");

		String thirdElement = setlist.next();
		System.out.println("thirdElement:+thirdElement");

		String fourthElement = setlist.next();
		System.out.println("fourthElement:+fourthElement");

	}

}
