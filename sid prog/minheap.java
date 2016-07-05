import java.io.*;
import java.util.*;

 public class minheap
{
	public static ArrayList<Integer> arr=new ArrayList<Integer>();
	public static void main(String[] args)
	{
		String s=System.console().readLine("Enter integers to array and exit");
		while( s.equals("exit")!= true)
		{
			int e=Integer.parseInt(s);
			arr.add(e);
			s=System.console().readLine();		
		}	
	
	int t=Integer.parseInt(System.console().readLine("Enter the number of top elements you wish to display\n"));
    if(t <= arr.size())
		topmin(t)	;
	else
		System.out.println("wrong input");
   	}
	public static void topmin(int t)
	{
		PriorityQueue<Integer> minp=new PriorityQueue<Integer>(t,new Comparator<Integer>(){
			public int compare(Integer int1,Integer int2)	
			{
				if(int1 > int2)
					return 1;
				else if(int2 > int1)
					return -1;
				return 0;					
			}					
		});
		int i=0;
		for(i=0;i<t;i++)
	   	   minp.add(arr.get(i));
	   	while(i <arr.size())
		{
			if(arr.get(i)> minp.peek())
			{
				int temp=minp.poll();
				minp.add(arr.get(i));
				arr.set(i,temp);
                i++;
                continue;				
			}	
			i++;			
		}
		
		Iterator it=minp.iterator();
		while(it.hasNext())
			System.out.println(it.next()+"\t");
		
	} 
}




