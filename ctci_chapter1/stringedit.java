import java.io.*;
import java.util.*;
//time complexity is O(n) ,where n is size of  string.

public class stringedit
{
	public static void main(String[] args)
	{
		String st1,st2;
		st1=System.console().readLine();
		st2=System.console().readLine();
		if(st1.compareTo(st2) ==0 )
		{
			System.out.println("the two strings are equal\n they are 0 edits away\n");			
		}		
		if (st1.length() >= st2.length())
			check(st1,st2);			
		else
			check(st2,st1);
	}
	
	
	public static void check(String s1,String s2)	
	{
	    int index=0 ;
		int count=0,k=0;
		char ch=' ' ;
		if((s1.length()-s2.length( )) > 1 )
			System.out.println("the two strings need more edits than 2 edits");
		else if(s1.length()-s2.length() == 1)
		{
			for(int j=0;j < s2.length(); j++,k++)
			{
				if (s1.charAt(k)!= s2.charAt(j) )
				{
					ch=s1.charAt(k);
					index=k;
					count++;
					j=j-1;
				}
				else if((j == s2.length()-1) && count==0 ) 
				{
					k++;
					ch=s1.charAt(k);
					index=k;
					count++;
				}										
				if(count > 1)	
					break;
			}			
	   		if(count == 1)		
				System.out.println("by inserting the character "+ ch +" at index " + index +" in " + s2 +" they are equal\n They are 1 step away from edit\n");
			else if (count >1 )
				System.out.println("they are more than 1 edit away from string matching\n" );
		}
		else if (s1.length() == s2.length()) 
		{
			for(int j=0;j < s1.length(); j++)	
			{ 
				if (s2.charAt(j) != s1.charAt(j))
				{
					ch=s1.charAt(j);
					index=j;
					count++;		
				}			
			}
			if(count == 1)
				System.out.println("By replacing the character  in "+s2+" with "+ch+" at index "+index +" two strings will be equal\n");
			else if(count>1)
				System.out.println("they are more than 1 edit away from string matching\n" );
				
		}				
	}		
}	



