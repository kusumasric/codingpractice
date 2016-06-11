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
	public static student[] s1;
	public static int c; 
	public static void main(String[] args )
	{
		int no,studentcount;
		String name;
		studentcount=Integer.parseInt(System.console().readLine("Enter number of students"));
		s1=new student[studentcount];
		char ch=' ';
		ch=System.console().readLine("enter y for to create a student and n for no").charAt(0);
		while (ch == 'y')
		{
			if(c< studentcount)	
			{
				no=Integer.parseInt(System.console().readLine("enter roll number : "));
				name=System.console().readLine("Enter the name : ");		
				student s=new student(no,name);
				s1[c++]=s;	
				ch=System.console().readLine("enter y for to create a student and n for no").charAt(0);	
				continue;
			}
			else
			{
				System.out.println("\n crossing the limit of number of students \n");
				break;
			}	
		}
		if(ch=='n')
			System.out.println ("Entered the option to exit the student creation\n")
			
		String choise=System.console().readLine(" choose an option to display 1.Rollnumber 2.Name of student\n")	;
		if(choise.equals("Rollnumber")==true  )
			rolldisp(s1);
		else if(choise .equals("Name "))
			namedisp(s1);
		else
			disp(s1);
		
	}		
	
	public static void disp(student[] s)
	{
		for(int i=0;i<c;i++)
		{
			System.out.println(s[i].rollno+"\t"+s[i].name);
		}
		
	}
	
	public static  void  rolldisp(student[] st)
	{
		student temp;
		for(int i=0;i <c;i++)
		{
			for(int j=i+1 ; j<c;j++)
			{
				if(st[j].rollno< st[i].rollno )
				{
					temp=st[i];
					st[i]=st[j];
					st[j]=temp;
					
				}				
			}				
		}

		disp(st);
	}
	public static void namedisp(student[] st )
	{
		
		
	}
}