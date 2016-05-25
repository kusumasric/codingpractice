import java.io.*;
import java.util.*;

public class node
{
	public int data;
	public node next;
	
	public node(int d)
	{
		data=d;
		next=null;
	}
	public static node th;
	public  static node head;
	public static void main(String[] args)
	{
		String str;
		int d1,count=0;		
		System.out.println("Enter the input or for exit type 'exit' \n");
		str=System.console().readLine();
		
		while( str.equals("exit")!= true);
		{
			
			d1=Integer.parseInt(str);
			node current=new node(d1);
			if(count==0)
			{
				head=current;
				count++;
			}	
		
			th=head;
			while(th.next!= null)
			{
				th=th.next;
			}
			
			th.next=current;
			th.next=null;	
			str=System.console().readLine();
		}	
		
		else
		{
			System.out.println(" enterede exit\n");
			return;
		}
		
		th=head;
		while (th.next!=  null)
		{
			System.out.println(th.data+"\t");
		}
		
		
	}
	
	
}		