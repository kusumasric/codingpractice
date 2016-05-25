import java.util.*;
import java.io.*;

public class knumber
{
	public static void main(String args[]) throws Exception
	{
	  int n,k,store;
	  PrintStream out=new PrintStream (new FileOutputStream("knumberoutput.txt"));
	  n=Integer.parseInt(System.console().readLine());
	  k=Integer.parseInt(System.console().readLine());
	  while( (k > n) || (k <1))
	  {
		  System.out.println(" please enter the valid value for k within "+n+"numbers");
		  k=Integer.parseInt(System.console().readLine());
	  }
	  int[] input=new int[n] ;
	  for(int i=0;i<n; i++)
		{
			//System.out.println("Enter the "+i+" number:\t " );
			input[i]=Integer.parseInt(System.console().readLine());
	  	}
	 //Re-arranging them to descending order b using same array
	  for (int i=0; i<k ; i++)
		{
			for (int j=i+1; j<n; j++)
			{
				if(input[i] < input[j] )	
				{
					store=input[i];
					input[i]=input[j];
					input[j]=store;					
				}
						
			}          		
		}
	//printing the numbers in decsending order	
	 for(int i=0;i<n;i++) 
		{
		
		 out.print(input[i]+"\n");
		}
	 
	 out.print(k+"th highest element is "+input[k-1]) ;   

	}

}