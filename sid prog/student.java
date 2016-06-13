import java.io.*;
import java.util.*;

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
		int no;
		ArrayList<student> s1=new ArrayList<student>() ;
		String name;
		char ch=' ';
		ch=System.console().readLine("enter y for to create a student and n for no").charAt(0);
		while (ch == 'y')
		{
			no=Integer.parseInt(System.console().readLine("enter roll number : "));
			name=System.console().readLine("Enter the name : ");		
			student s=new student(no,name);
			s1.add(s);	
			ch=System.console().readLine("enter y for to create a student and n for no").charAt(0);	
			continue;
		}
		
		if(ch=='n')
		System.out.println ("Entered the option to exit the student creation\n");
		String choise=System.console().readLine(" choose an option to display 1.Rollnumber 2.Name 3.Exit\n");
		while(choise.equals("exit")!= true)
		{	
			if(choise.equals("Rollnumber")==true)
				rolldisp(s1);
			else if(choise.equals("Name") ==true)
				namedisp(s1);
			else 
				disp(s1);
			choise=System.console().readLine(" choose an option to display 1.Rollnumber 2.Name 3.Exit\n");
		}	
		if(choise.equals("Exit")== true)
			return;
		
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