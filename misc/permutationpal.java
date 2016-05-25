import java.io.*;
import java.util.*;

public class permutationpal
{
	public static void main(String[] args)
	{
		String input;
		input=System.console().readLine("Enter a string : ");
		methodper(input);	
	}

	public static void methodper(String in)
	{
		int[] count1=new int[256];
		
		int ascii,k=0,count2=0,j=0;
		
		Arrays.fill(count1,0);
		for(int i=0;i < in.length();i++ )
		{
			ascii=(int)in.charAt(i);
			count1[ascii]+=1;
		}	
		
		for(j=0;j <256;j++)
		{  
			if(count1[j] % 2== 0)
			{
				continue;
			}	
			else if(count1[j]%2 ==1)
			{
				count2++;
			}	
			
		}
				
		if(count2 ==0 || count2 == 1)
		System.out.println("True: it is a permutation of a palandrome ");
		else
		System.out.println("False:it is not a permutation of a palandrome")	;
		
	}	
	
}