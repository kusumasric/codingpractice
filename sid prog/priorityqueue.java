import java.io.*;
import java.util.*;

public class priorityqueue
{
//	public static PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	public static PriorityQueue<Integer> pq=new PriorityQueue<Integer>(10,new Comparator<Integer>(){
			public int compare(Integer int1,Integer int2)	
			{
				if(int1 < int2)
					return 1;
				else if(int2 < int1)
					return -1;
				return 0;					
			}
		});  
	    
	public static void main(String[] args)
	{	
		String delim=System.console().readLine("Enter delimiter");
		String[] temp;
	   	String str=System.console().readLine("Enter input\n");
		
		while(str.equals("exit")!= true)
		{	temp=str.split(delim);
			if(temp[0].equals("i")== true )		
			{
				int e=Integer.parseInt(temp[1]);
			    pq.add(e);
			}		
			else if(temp[0].equals("topmax")==true)
			{
				int t=Integer.parseInt(temp[1]);
				topmax(t);				
			}	
			else if(temp[0].equals("disp")==true)		
			{
				disp();
			}
			else if(temp[0].equals("exit")==true)
			  return ;	
		    else
			 System.out.println("entered wrong input\n")	;
		    str=System.console().readLine();
		}
	
	}	
	public static void topmax(int t)
	{
		int[] output= new int[t];
		int j=0;
        while(j< t)			
		{
			output[j]=pq.poll();
			System.out.println(output[j]);
			j++;
		}			 
	}
	public static void disp()	
	{
		Iterator it=pq.iterator();
		while(it.hasNext())
			System.out.println(it.next()+"\t");
	}	
	
	
	
}