

import java.io.Console;
import java.util.*;
import java.io.*;

public class stringpalfind
{
	public static void main(String args[])
	{
		String si;
		String[] temp;
		StringBuilder ch2=new StringBuilder();
		
		System.out.println("Enter a string ");
		si=System.console().readLine();
		
		System.out.println("The Input you have Entered is : \t"+si);
		int len=si.length();
		System.out.println( "length of string is "+len);
		String delimeter =System.console().readLine("Enter the delimiter you wish to split the string");
		temp = si.split(delimeter);
		System.out.println("Length of temp:\t"+temp.length);
		for(int i=0 ;i < temp.length; i++)
			System.out.println(temp[i]);
		
		System.out.println("\n");
		
		for( int i=0; i < temp.length ;i++ )
		{
			ch2.delete(0,ch2.length());
			ch2 = ch2.append(temp[i]).reverse();
			for (int j=i+1; j < temp.length ;j++)
			{
				if ( temp[j].compareTo(ch2.toString()) == 0)
					System.out.println("the string which has palandrome is  is: \t"+ch2.reverse())	;
			}
		}
		
	}
}