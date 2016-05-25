import java.io.*;
import java.util.*;
//Time complexity is-[if m and n are length of string a,b is O(m^2)) 

public class permutation
{
	public static void main(String args[])
	{
		String string1,string2;
		System.out.println("enter two strings to know whether they are permutations of one other :");
		string1 = System.console().readLine();
		string2=System.console().readLine();
		per( string1,string2);
	}
	
	public static void per(String a,String b)
	{	
		//char ch;
		int ascii;	
		int[] count1=new int[256];		
		//int[] count2=new int[256];
		Arrays.fill(count1,0);
		//Arrays.fill(count2,0);
		if (a.length()!= b.length() )
			System.out.println("Two strings are not permutations of each other\n");
	/*	else
		{		  
			for (int i=0;i< a.length() ;i++)
			{
				ch=a.charAt(i);
				count1=0;
				count2=0;
				for(int k=0; k< a.length();k++)
				{
					if(a.charAt(k)==ch)
						count1++;
					if(b.charAt(k)==ch)
						count2++;
				}
				
				if(count1!=count2)
				{
					System.out.println("The two strings are not permutation to each other");
					return;
				}			
			}
				
			System.out.println("the two strings are permutational");
		}	*/

			else
			{
				for(int i=0;i< a.length();i++)
				{
					ascii=(int)a.charAt(i);
					count1[ascii]+=1;
					ascii=(int)b.charAt(i);
					count1[ascii]-=1;				
				}
				for(int j=0;j< 256;j++)
				{
					if(count1[j]!=0)
					{
						System.out.println("The two strings are not permutation");
						return;
					}							
				}
				
				System.out.println("the two strings are permutational");
				
			}	


				
	}
  

}