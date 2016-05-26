import java.io.*;
import java.util.*;

public class removeduplicates extends node
{
	public static node th=null;
	public  static node head=null,prev=null,search=null;
	
	public static int ch;

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
		//printing the elements
		/*if(head ==null)
			System.out.println("There are no elements in the list") ;
		else
		{
			th=head;
			while(th !=null) 
			{
			System.out.println(th.data+"\t");
			th=th.next;
			}
			
		}*/
		
		//to find duplicates
		
		th=head;
		while(th!=null)
		{
			ch=th.data;
			search=th.next;
			while(search!=null)
			{	
				if (search.data == ch)
				{	prev=th;
					while(prev.next !=search)
					{ 
						prev.next=prev.next;
					}						
					prev.next=search.next;
					search=prev;
					continue;
				}
							
				search.next=search.next;
			
			}
			th=th.next;
		}
		System.out.println("The linked list without duplicates is:\n");
		th=head;
		while(th!=null)
		{
			System.out.println(th.data);
			th=th.next;
		}	
	}
}		