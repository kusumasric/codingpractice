import java.io.*;
import java.util.*;
//runtime is 
public class nodepartition
{
	int d;
	nodepartition next=null;
	public  nodepartition(int data)
	{
		d=data;	
		next=null;
	}
	public static nodepartition head,th,replace,middle,sort;
	public static void main(String[] args)
	{
		int n,count=0 ;
		String str;
		str=System.console().readLine(" Enter a number  or exit to leave the program\n");
		while (str.equals("exit") == false )
		{
			n=Integer.parseInt(str);
			nodepartition current= new nodepartition(n);
			if(count ==0)
			{
				head=current;
				count++;
				str=System.console().readLine(" Enter a number  or exit to leave the program\n");
				continue;				
			}
			
			else
			{
				th=head;
				while(th.next != null ) 
				{
					th=th.next;
				}
				
				th.next=current;
				str=System.console().readLine(" Enter a number  or exit to leave the program\n");				
			}
			if(str.equals("exit") )
				break;					
		}
		th=head;
		int length=0;
		while(th!=null)
		{
			System.out.println(th.d+"\n");
			th=th.next;
			length++;
		}	
		int x,c=0;
		x=Integer.parseInt(System.console().readLine("Enter a number with in linked list\n")) ;
	
		while(c==0)
		{    th=head;
			while(th!=null)
			{    
				if(th.d != x)
				{
					th=th.next;
					continue;
				}	
		
				else
				{	
					c=c+1;
					System.out.println("element within rage \n")	;
					break;
				}
			
			}
			if(c==0)
				x=Integer.parseInt(System.console().readLine("Enter a number with in linked list\n")) ;
				
	    }
	//sorting elements
	th=head;
	int c1=1,store=0;
	while(c1 <= length)
	{	
		sort =th.next;
		if(th.d < x)
		{
			th=th.next;
			c1++;
			continue;	  
		}
		else if(th.d > x)
		{
			sort=th;
		    if(sort.d > x )
			{
				sort=sort.next;
			}
		
			store=th.d;
			th.d=sort.d;
			sort.d=store;
			th=th.next;
			c++;
			continue;
			
		}
		
			
	}
	// replacing the elements	
		th=head;
		middle=head;
		while(c1 <=(int)length/2)
		{
			middle=middle.next;
			c1++;
		}
		replace=middle;
		c1=1;
		while (c1 <=(int)length/2)
		{
			if(th.d < x )
			{
				th=th.next;
				c1++;
				continue;				
			}	
			else if (th.d >= x ) 
			{
				middle=replace;
				while(middle.d >x)
				{
					middle=middle.next;
				}
				store=middle.d;
				middle.d=th.d;
				th.d=store;
				th=th.next;
				c1++;
				continue;
			}
			
		}
	
		
				
		System.out.println("modified linked ist is\n");
		th=head;
		while(th!=null)
		{
			System.out.println(th.d+"\n");
			th=th.next;
			
		}	
		
	
	}











}