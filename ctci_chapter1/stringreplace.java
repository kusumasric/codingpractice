import java.io.*;
import java.util.*;
//Run time =O(n), where n=size of input

public class stringreplace
{
	public static void main(String args[])
	{
		char[] input;
		int size;		
		input=System.console().readLine("Enter the string input:").toCharArray();
		size=Integer.parseInt(System.console().readLine("enter the length of string with spaces :"));
		char[] output=new char[size * 3];
		for(int i=0,j=0; i < size && j < (size*3) -1 ; i++)
		{
			if(input[i]==' ')
			{
				output[j++]='%';
				output[j++]='2';
				output[j++]='0';
							
			}				
			else
				output[j++]=input[i];
					
		}
		
		System.out.println(output);
	}
}