import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.Scanner.*;
import java.io.IOException;

public class student1 
{
	int rollno;
	String name;	
	
	public static student1 right=null,left=null,root=null,th=null;
	public student1()
	{
		rollno=0;
		name=" ";
	}
	
	public student1(int r,String n)
	{
		rollno=r;
		name=n;
		
	}
	public static Pattern pattern1 = Pattern.compile("[a-zA-Z]",Pattern.CASE_INSENSITIVE);
	public static Pattern pattern2=Pattern.compile("[0-9]",Pattern.CASE_INSENSITIVE);
	public static Pattern pattern3=Pattern.compile(".*\\.json",Pattern.CASE_INSENSITIVE);
	public static void main(String[] args) 	throws IOException
	{	
		ArrayList<student1> s1=new ArrayList<student1>() ;
		String delimeter=System.console().readLine("Enter the delimeter you wish to use");
		String input=System.console().readLine();
		String[] splitarr ;		
		while (input.equalsIgnoreCase("exit")!= true )
		{
			splitarr=input.split(delimeter);
			
            if(splitarr[0].equalsIgnoreCase("I")== true )		
			{
				insert(s1,splitarr);
			}
			else
				System.out.println (" wrong input \n Format to give input : I <name> <rollnumber> and for printting : p o <rollno/Name> or just  p  \n");
			input=System.console().readLine();	
		}
	}
	public static void insert(ArrayList<student1> s1,String[] splitarr)
	{
		int no=0;
		String name=" ";
		int countn=0,countr=0;
		for( int i=1;i < splitarr.length; i++)
		{
			Matcher matcher = pattern1.matcher(splitarr[i]);
			if(matcher.find())
			{
				name+=splitarr[i];
				name+=" ";
				countn++;
			}	
			Matcher matcher1=pattern2.matcher(splitarr[i]);
			if(matcher1.find())
			{
				no=Integer.parseInt(splitarr[i]);	
				countr++;
			}
		}
		if(countn >0 && countr > 0 )		
		{	
			for(int i=0;i<s1.size();i++)
			{	
				if(s1.get(i).rollno == no)
				{
				System.out.println("The roll number already exists please enter command again ");
				return;
				}
			}
				student1 s=new student1(no,name);
				
				
		}
		else if(countn ==0 ) 
			System.out.println("Enter input again no name");
		else if(countr ==0 )
			System.out.println("Enter input again no Rollno ");								
		
	}		

}