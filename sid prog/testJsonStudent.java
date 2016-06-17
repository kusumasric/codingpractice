

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.Scanner.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
//TODO: enforce format - wrong format print error
//TODO: program should be case insensitive
//TODO: Implement save and load from file options-
//--.ttt files getting created? && disp () is not working.
//javac -classpath ";F:\Work\JavaLibs\gson-2.3.1.jar" testJsonStudent.java
//java -classpath ".;F:\Work\JavaLibs\gson-2.3.1.jar;" testJsonStudent
public class testJsonStudent 
{
	int rollno;
	String name;
	
	public testJsonStudent()
	{
		rollno=0;
		name=" ";
	}
	public testJsonStudent(int r,String n)
	{
		rollno=r;
		name=n;
	}
	public static void main(String[] args )throws IOException
	{
		testJsonStudent test = new testJsonStudent(123, "kusuma");
		testJsonStudent test2= new testJsonStudent(56,"sidda appa")	;
		FileWriter writer = new FileWriter("Output.json");
		Gson gson = new GsonBuilder().create();
		gson.toJson(test,writer);
		System.out.println(gson.toJson(test2));
		writer.flush();
		writer.close();
	}
}