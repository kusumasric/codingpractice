import java.io.*;
import java.util.*;
//Time complexity is -n(n-1) ,n elements
public class node
{
	public int data;
	public node next;
	
	public node ()
	{
		
	}
	public node(int d)
	{
		data=d;
		
	}
	public static node th=null;
	public  static node head=null;
	public static void main(String[] args)
	{
		String str;
		int d1,count=0;		
		System.out.println("Enter the input or for exit type 'exit' \n");
		str=System.console().readLine();
		
		while( str.equals("exit")!= true)
		{
			
			d1=Integer.parseInt(str);
			node current=new node(d1);
			current.next=null;
			if(count==0)
			{
				head=current;
				count++;
				System.out.println("Enter the input or for exit type 'exit' \n");
				str=System.console().readLine();
				continue;
								
			}	
			th=head;
			while(th.next!= null)
			{
				th=th.next;
			}
			
			th.next=current;
			System.out.println("Enter the input or for exit type 'exit' \n");
			str=System.console().readLine();
			if( str.equals("exit")== true)
			{
			System.out.println(" entered exit\n");
			break;
			}
		}		
		
		if(head ==null)
			System.out.println("There are no elements in the list") ;
		else
		{
			th=head;
			while(th.next!=null) 
			{
			System.out.println(th.data+"\t");
			th=th.next;
			}
			System.out.println(th.data+"\t");
		}
		
	}
	
	
}		