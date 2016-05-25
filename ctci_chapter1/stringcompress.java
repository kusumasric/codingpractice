import java.io.*;
import java.util.*;

public class stringcompress
{
	public static void main(String[] args) 
	{
		String input;
		input=System.console().readLine();
		String output = new String();
		int k, currentCount, j = 0;
		while(j <= input.length()-1)		
		{
			char current = input.charAt(j);
			currentCount = 0;
			while(j < input.length() && input.charAt(j) == current ){
				currentCount++;
				j++;
			}
			output += current;
			output += String.valueOf(currentCount);
		}
		
		if(input.length() > output.length() )
			System.out.println(" The compressed format of string is"+output);
		else if(output.length() > input.length())
			System.out.println("The compressed format is bigger than string"+input);
		else 
			System.out.println("Both are equal"+input+"\t"+output);		
	}
}