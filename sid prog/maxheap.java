import java.io.*;
import java.util.*;

public class maxheap
{
	public static ArrayList<Integer> heap=new ArrayList<Integer>();
	public static void main(String[] args)
	{		
		String delim=System.console().readLine("Enter delimiter");
		String str=System.console().readLine("Enter input\n");
		String[] temp;
		while(str.equals("exit")!= true)
		{	temp=str.split(delim);
			if(temp[0].equals("i")== true )		
			{
				int e=Integer.parseInt(temp[1]);
			    insert(e);				
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
	
	public static void disp()
	{
		for(int i=0;i<heap.size();i++)
			System.out.println(heap.get(i));
	}
	public static void insert(int e)
	{
		int j=heap.size();
		heap.add(j,e);
		int k=(int)(j-1)/2;
		while(heap.get(k) < heap.get(j))
		{
			int swap=heap.get(k);
			heap.set(k,heap.get(j));
			heap.set(j,swap);
			j=k;
			k=(int)(j-1)/2;
		}
	}
	public static void topmax(int t)
	{
		int[t] topele;
		int k=0;
		while(k<= t)
		{	
			topele[k++]=heap.get(0);
			heap.set(0,heap.get(heap.size()));
		
		
		
		
	}
	
}