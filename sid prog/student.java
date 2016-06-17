import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.Scanner.*;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.InputStreamReader;
import java.lang.String;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
//TODO: enforce format - wrong format print error
//TODO: program should be case insensitive
//TODO: Implement save and load from file options-
//--.ttt files getting created? && disp () is not working.

//TODO sorting should be case insensitive
//TODO make sure roll numbers are unique
//TODO system should never crash . It should only throw error
//TODO implement clear

public class student 
{
	int rollno;
	String name;
	
	public student()
	{
		rollno=0;
		name=" ";
	}
	
	public student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	public static void main(String[] args )throws IOException
	{
		ArrayList<student> s1=new ArrayList<student>() ;
		String delimeter=System.console().readLine("Enter the delimeter you wish to use");
		String input=System.console().readLine();
		String[] splitarr ;
		Pattern pattern1 = Pattern.compile("[a-zA-Z]",Pattern.CASE_INSENSITIVE);
		Pattern pattern2=Pattern.compile("[0-9]",Pattern.CASE_INSENSITIVE);
		Pattern pattern3=Pattern.compile(".*\\.json",Pattern.CASE_INSENSITIVE);
		Gson gson=new GsonBuilder().create();
		while (input.equalsIgnoreCase("exit")!= true )
		{
			splitarr=input.split(delimeter);
			int no=0;
			String name=" ";
			int countn=0,countr=0;
            if(splitarr[0].equalsIgnoreCase("I")== true )		
			{
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
					student s=new student(no,name);
					s1.add(s);
				}
				else if(countn ==0 ) 
					System.out.println("Enter input again no name");
				else if(countr ==0 )
					System.out.println("Enter input again no Rollno ");						
			}
			else if(splitarr[0].equalsIgnoreCase("p")==true && splitarr.length >1)
			{
				if (splitarr[1].equalsIgnoreCase("o")== true)
				{
					if(splitarr[2].equalsIgnoreCase("Rollno")== true)
						rolldisp(s1);
					else if(splitarr[2].equalsIgnoreCase("Name")== true)
						namedisp(s1);					
				}				
			}
			else if (splitarr[0].equalsIgnoreCase("p")== true && splitarr.length==1)
				disp(s1);
			
			else if(splitarr[0].equalsIgnoreCase("save")== true)
			{
				Matcher mat=pattern3.matcher(splitarr[1]);
				if(mat.find())
				{	
					Writer saveFile=new FileWriter(splitarr[1]);
					gson.toJson(s1,saveFile);
					saveFile.close();					
				}
				else
					System.out.println(" entered wrong file name enter file with <filename>.json");					
			}
			else if(splitarr[0].equalsIgnoreCase("load")== true) 	
			{
				Matcher mat=pattern3.matcher(splitarr[1]) ;
				if(mat.find())
				{							
					s1.clear();
					Reader r=new FileReader(splitarr[1]);
				    Type type = new TypeToken<ArrayList<student>>(){}.getType();
					s1=gson.fromJson( r,type);
					disp(s1);					
				}
				else
					System.out.println(" entered wrong file name enter file with <filename>.txt");					
			}	
			else if(splitarr[0].equalsIgnoreCase("append")== true)
			{
				Matcher m=pattern3.matcher(splitarr[1]);
				if(m.find())
				{
					ArrayList<student> s2=new ArrayList<student>();
					Reader r=new FileReader(splitarr[1]);
				    Type type = new TypeToken<ArrayList<student>>(){}.getType();
					s2=gson.fromJson( r,type);
					s1.addAll(s2);
					disp(s1);
				}
				else
					System.out.println(" entered wrong file name enter file with <filename>.txt");	
			}	
			else
				System.out.println (" wrong input \n Format to give input : I <name> <rollnumber> and for printting : p o <rollno/Name> or just  p  \n");
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
			for(int j=i+1; j < st.size(); j++)
			{
				if(st.get(j).rollno < st.get(i).rollno)
				{			
					temp=st.get(i);
					st.set(i,st.get(j));
					st.set(j,temp);					
				}				
			}				
		}

		disp(st);
	}
	
	public static void namedisp(ArrayList<student> st)
	{
		student temp;
		for(int i=0; i < st.size(); i++)
		{
			for(int j=i+1; j < st.size(); j++)
			{
				if(st.get(i).name.compareTo(st.get(j).name) > 0)
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