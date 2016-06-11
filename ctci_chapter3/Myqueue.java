import java.io.*;
import java.util.*;
//runtime is O(n),where n is number of elements
public class Myqueue
{
	public static Stack <Integer> s1= new Stack <Integer>();
	public static Stack <Integer> s2= new Stack <Integer>();
	
	public static void main(String[] args)
	{		
		int ele,elerem ,elepeek,eledisp;
		String opt;
		opt=System.console().readLine("Enter add/remove/peek/ display/exit:");
		while(opt.equals("exit")!= true)
		{
			if(opt.equals("add")== true )
			{
				ele=Integer.parseInt(System.console().readLine("Enter element to push"));
				s1.push(ele);
				opt=System.console().readLine("Enter add/remove/peek/ display/exit:");
				continue;
			}
			else if(opt.equals("remove")==true)
			{
				while(s1.isEmpty()!= true )
					s2.push(s1.pop());
				elerem=s2.pop();
				System.out.println("Element removed is"+elerem);
				while(s2.isEmpty()!= true)	
					s1.push(s2.pop());
				opt=System.console().readLine("Enter add/remove/peek/ display/exit:");
				continue;
			}
			else if(opt.equals("peek") ==true) 
			{
				while(s1.isEmpty()!= true )
					s2.push(s1.pop());
				elepeek=s2.peek();
				System.out.println("Element at top  is"+elepeek);
				while(s2.isEmpty()!= true)	
					s1.push(s2.pop());	
				opt=System.console().readLine("Enter add/remove/peek/ display/exit:");
				continue;
			}
			else if (opt.equals("display")==true)
			{
				while(s1.isEmpty()!= true)
					s2.push(s1.pop());
				while(s2.isEmpty()!= true)
				{	
					eledisp=s2.peek();
					System.out.println(eledisp);
					s1.push(s2.pop());
				}	
				opt=System.console().readLine("Enter add/remove/peek/ display/exit:");
				continue;
			}
			
			else if(opt.equals("exit"))
			{
				System.out.println(" Exiting from program\n");
				return;
			}
			
		}
		
	}
	
}
