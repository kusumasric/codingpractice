import java.io.*;
import java.util.*;
import java.util.regex.*;

//TODO: Use dynamic array in java . Then you dont need number of students before hand

public class student
{
	int rollno;
	String name;
	
	public student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	public static void main(String[] args )
	{
		ArrayList<student> s1=new ArrayList<student>() ;
		String delimeter=System.console().readLine("Enter the delimeter you wish to use");
		String input=System.console().readLine();
		String[] splitarr ;
		Pattern pattern1 = Pattern.compile("[a-zA-Z]");
	
		while (input.equals("exit")!= true )
		{
			splitarr=input.split(delimeter);
			int no=0;
			String name=" ";
            if(splitarr[0].equals("I")== true )			
			{
				for( int i=1;i < splitarr.length; i++)
				{
					Matcher matcher = pattern1.matcher(splitarr[i]);
					if(matcher.find())
					{
						name+=splitarr[i];
					}	
					else
						no=Integer.parseInt(splitarr[i]);					
				}								
				student s=new student(no,name);
				s1.add(s);									
			}				
			
			else if(splitarr[0].equals("p")==true)
			{
				if (splitarr[1].equals("o")== true)
				{
					if(splitarr[2].equals("Rollno")== true)
						rolldisp(s1);
					else if(splitarr[2].equals("Name")== true)
						namedisp(s1);					
				}				
				else 
					disp(s1);
			}
			
			input=System.console().readLine();	
		}				
	}		
	
	public static void disp(ArrayList<student> s)
	{
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s.get(i).rollno+"\t"+s.get(i).name);
		}		
	}
	
	public static  void  rolldisp(ArrayList<student> st)
	{
		student temp;
		for(int i=0;i < st.size();i++)
		{
			for(int j=i+1 ; j < st.size();j++)
			{
				if(st.get(j).rollno < st.get(i).rollno )
				{					
					temp=st.get(i);
					st.set(i,st.get(j));
					st.set(j,temp);					
				}				
			}				
		}

		disp(st);
	}
	
	public static void namedisp(ArrayList<student> st )
	{
		student temp;
		for(int i=0;i<st.size();i++)
		{
			for(int j=i+1;j<st.size();j++)
			{
				if((st.get(i).name).compareTo(st.get(j).name) >0)
				{
					temp=st.get(j);
					st.set(j,st.get(i));
					st.set(i,temp);
				}	
			}			
		}  
			
		disp(st);		
	}
}