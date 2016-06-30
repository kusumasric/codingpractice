import java.io.*;
import java.util.*;


class icecreamhashmap 
{
	public static void main(String[] args)
	{
	HashMap<String,Integer> icecream=new HashMap<String,Integer>();
	icecream.put("peach",new Integer(20));
	icecream.put("banasplit",new Integer(5));

	/*Set set=icecream.entrySet();
	
	Iterator i=set.iterator();
	while(i.hasNext()) 
	{
		Map.Entry e=(Map.Entry)i.next();
		System.out.println(e.getKey()+"\t"+e.getValue());
	}*/
	System.out.println(icecream);
	}	
	
	
	
}