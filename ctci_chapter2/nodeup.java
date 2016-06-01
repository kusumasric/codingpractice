import java.io.*;
import java.util.*;
//run time of algorithm is -o(n(n-1))==o(n^2)
public class  nodeup
{
	int data;
	public nodeup next;
	
	public nodeup(int d)
	{
		data=d;
		next=null;
	}
	public static nodeup head=null,th=null;
	public static void main(String[] args)
	{
		String str;
		int d1,count=0,listsize=0,k=0;
		System.out.println("Enter number or exit \n");
		str=System.console().readLine();
		while(str.equals("exit")!= true )
		{
			d1=Integer.parseInt(str);
			nodeup current=new nodeup(d1);
			if(count==0)
			{
				head=current;
				count++;
				listsize++;
				System.out.println("Enter number or exit \n");
				str=System.console().readLine();
				continue;
			}
			else
			{
				th=head;
				while(th.next!= null)
				{
					th=th.next;
				}				
				th.next=current;
				listsize++;
				System.out.println("Enter number or exit\n");
				str=System.console().readLine();
				
			}				
			if (str.equals("exit")==true)
			{
				System.out.println("exit the input\n");
				break;
			}	
		}
		th=head;
		while(th!=null)
		{
			System.out.println(th.data+"\t");
			th=th.next;
		}
		count=0;
		k=Integer.parseInt(System.console().readLine("Enter k th number"));
		if( k<1 || k >listsize )
		{
			System.out.println("The k th number you choose is beyond the size of the linkedlist\n");
		}
		else
		{
			System.out.println("The elements from kth to last is:\n");
			th=head;
			count=1;
			while(count < k)
			{
				th=th.next;
				count++;
			}
			while(th!=null)
			{
				System.out.println(th.data+"\t");
				th=th.next;
			}	
			
		}
		
		
		
	}
	
	
}	