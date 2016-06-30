import java.io.*;
import java.util.*;

class choclatetreehm
{
	public static void main(String[] args)
	{
		TreeMap  choclate=new TreeMap();
		choclate.put("Milkybar",new Integer(3));
		choclate.put("choco sticks",new Integer(4));
		Set set=choclate.entrySet();	
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey()+"\t"  + e.getValue());
		}	
		System.out.println(choclate.get("choco sticks"));

	}
}
