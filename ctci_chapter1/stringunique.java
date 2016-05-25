import java.io.*;
import java.util.*;
//TODO: Fill complexity here--O(n^2)
public class stringunique
{
	public static void main(String args[])
	{
		//need to figure out whether to use char array or string 
		//TODO: Use boolean instead .---no need to use boolean
		String input=System.console().readLine("enter a string :");			
		for(int i=0;i < input.length(); i++)
		{
			for(int j=i+1;j < input.length();j++)
			{
				if(input.charAt(i)==input.charAt(j))
				{
					System.out.println("string doesnot have unique characters");
					return;
				}
			}
		}
		System.out.println("String has unique characters");
	}


}