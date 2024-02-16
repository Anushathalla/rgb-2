package collectionDemos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.support.ui.Select;

public class SetDemo2 
{


	public static void main(String[] args) 
	{
		Set <String> set = new HashSet<String>() ;
		set.add(" RBG technologies");
		set.add("JAva");
		set.add(" selenium");

		int setsize = set.size();
		System.out.println(" setsize:+setsize");

		set.add("RBG technologies");
		set.add("Java");
		set.add("selenium");
		set.add("ApI Testing");
		setsize = set.size();
		System.out.println("setsize:+setsize");
	}
}