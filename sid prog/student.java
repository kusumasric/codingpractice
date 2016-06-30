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
import java.util.Random;

//TODO: enforce format - wrong format print error
//why is append not working after load 


//TODO sorting should be case insensitive--done
//TODO make sure roll numbers are unique---done
//TODO system should never crash . It should only throw error -- done
//TODO implement clear--done

public class student 
{
	int rollno;
	String name;
	String address;
	public student()
	{
		rollno=0;
		name=" ";
		address=" ";
	}
	
	public student(int r,String n,String add)
	{
		rollno=r;
		name=n;
		address=add;
	}
	public static Pattern pattern1 = Pattern.compile("[a-zA-Z]",Pattern.CASE_INSENSITIVE);
	public static Pattern pattern2=Pattern.compile("[0-9]",Pattern.CASE_INSENSITIVE);
	public static Pattern pattern3=Pattern.compile(".*\\.json",Pattern.CASE_INSENSITIVE);
	public static Gson gson=new GsonBuilder().create();
	public static void main(String[] args )throws IOException
	{
		ArrayList<student> s1=new ArrayList<student>() ;
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
			else if(splitarr[0].equalsIgnoreCase("p")==true && splitarr.length == 3)
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
			else if(splitarr[0].equalsIgnoreCase("p")== true && splitarr.length==2)
				dispJsonFile(splitarr[1]);
			else if(splitarr[0].equalsIgnoreCase("save")== true)
				save(s1,splitarr[1]);
			else if(splitarr[0].equalsIgnoreCase("load")== true) 	
				s1 = load(s1,splitarr[1]);									
			else if(splitarr[0].equalsIgnoreCase("append")== true)
				append(s1,splitarr[1]);
			else if (splitarr[0].equalsIgnoreCase("clear")== true && splitarr.length==1)
				s1.clear();
			else if(splitarr[0].equalsIgnoreCase("Delete")==true)
				delete(splitarr[1]);
			else
				System.out.println (" wrong input \n Format to give input : I <name> <rollnumber> and for printting : p o <rollno/Name> or just  p  \n");
			input=System.console().readLine();	
		}				
	}		
	
	
	public static void dispJsonFile(String filePath)throws IOException
	{
		if(isJsonFile(filePath)){
			Reader r=new FileReader(filePath);
			Type type = new TypeToken<ArrayList<student>>(){}.getType();
			disp((ArrayList<student>)gson.fromJson( r,type));
			r.close();
		}
	}
	
	public static void disp(ArrayList<student> s)
	{
		for(int i=0;i<s.size();i++)
			System.out.println(s.get(i).rollno+"\t"+s.get(i).name+"\t"+s.get(i).address);
				
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
				if(st.get(i).name.toLowerCase().compareTo(st.get(j).name.toLowerCase()) > 0)
				{
					temp=st.get(j);
					st.set(j,st.get(i));
					st.set(i,temp);
				}	
			}			
		}
			
		disp(st);		
	}
	
	public static void save(ArrayList<student> s1,String st )throws IOException
	{
		
		Matcher mat=pattern3.matcher(st);
		if(mat.find())
		{	
			Writer saveFile=new FileWriter(st);
			gson.toJson(s1,saveFile);
			saveFile.close();					
		}
		else
			System.out.println(" entered wrong file name enter file with <filename>.json");		
	}
	
	public static boolean isJsonFile(String fileName){
		Matcher mat=pattern3.matcher(fileName) ;
		if(mat.find())
		{
			File f = new File(fileName);
			if(!f.exists() || f.isDirectory()) { 
				System.out.println("File does not exists .Please enter command")	;
				return false;
			}
			return true;
		}
		else{
			System.out.println(" entered wrong file name enter file with <filename>.txt");
			return false;
		}
	}
	
	public static ArrayList<student> load(ArrayList<student> s1,String st)throws IOException
	{
		if(isJsonFile(st))
		{	
			s1.clear();
			Reader r=new FileReader(st);
			Type type = new TypeToken<ArrayList<student>>(){}.getType();
			s1 = ((ArrayList<student>)gson.fromJson( r,type));
			r.close();
			disp(s1);
			return s1;
		}	
		return null;
	}
	
	public static void append(ArrayList<student> s1,String st)throws IOException
	{
		if(isJsonFile(st))
		{ 
			ArrayList<student> s2=new ArrayList<student>();
			Reader r1=new FileReader(st);
			Type type = new TypeToken<ArrayList<student>>(){}.getType();
			s2=gson.fromJson( r1,type);
			disp(s1);
			s1.addAll(s2);				
			r1.close();			
			disp(s1);
		}
	}
	public static void search(int roll)
	{
		for (int i=0;i< s1.size();i++)
		{
			if(s1.get(i).rollno==roll)
				System.out.println("found it");
			    
		}	
		
		
	}
	public static void delete(String del)
	{
		int no=0;
		no=Integer.parseInt(del);
		search(no);
		
		
		
		
	}
	
	public static void insert(ArrayList<student> s1,String[] splitarr)
	{
		int no=0;
		String name=" ";
		String addr=" ";
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
			StringBuilder str=new StringBuilder(10);
			Random r =new Random();
			int j=0;
			while (j<9)
			{   
			   int i=(int)48+r.nextInt(74);
			   str.append((char)i);
			   j++;
			   
			}
			addr=str.toString();
			student s=new student(no,name,addr);
			s1.add(s);
		}
		else if(countn ==0 ) 
			System.out.println("Enter input again no name");
		else if(countr ==0 )
			System.out.println("Enter input again no Rollno ");						

		
	}
	
}