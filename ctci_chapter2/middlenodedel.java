import java.io.*;
import java.util.*;

public class middlenodedel 
{

public char ch;
public middlenodedel next;	

	public middlenodedel(char ch1)
	{
		ch=ch1;
		next=null;
	}
	
public  static middlenodedel th=null,head=null,search=null,last=null;


	public static void main(String[] args)
	{
		String str,str2;
		char c;
		int count=0;		
		str= System.console().readLine("Enter the character\n");		
		while (str.equals("exit")!= true)
		{
			c=str.charAt(0);
			middlenodedel current=new middlenodedel(c);
			if(count==0)
			{
				head=current;
				count++;
				str=System.console().readLine("Enter the character or exit\n");
				continue;
			}
			else
			{
				th=head;
				while(th.next!=null)
				{
					th=th.next;	
				}
				th.next=current;
				str=System.console().readLine("Enter the character or exit\n");
			}	
			if(str.equals("exit") == true)
			{
				System.out.println("entered exit\n");
				break;
			}					
		}
		
		System.out.println("elements in list are:\n");
		th=head;
		while(th!=null)
		{
			System.out.println(th.ch+"\t"+"->\t");
			th=th.next;
		}		
		last=head;
		while(last.next!=null)
		{
			last=last.next;	
		}
					
		char del=' '; 
		str2=System.console().readLine("Enter the character to get deleted :");
		del=str2.charAt(0);
		th=head;
		search=th.next;
		if((head.ch)==del )
		{
			System.out.println(" The element cannot be deleted if it a first node \n");
		}	
		else
		{
			while(search.next != last)
			{	
				while((search.ch)!= del )	
				{
					search=search.next;
					th=th.next;
				}			
			th.next=search.next;
			search=th.next;
			}
			
			if(search==last && search.ch ==del)
			System.out.println(" The element cannot be deleted if it is a  last node \n");	
		
		}
		System.out.println("The Modified linked list is \n");
		th=head;
		while(th!=null)
		{
			System.out.println(th.ch+"\n");
			th=th.next;
		}		
		
	}

}