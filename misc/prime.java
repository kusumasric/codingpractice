import java.util.*;
import java.io.*;

class prime
{
	public static void main( String[]  args )throws Exception
		{
			int input,count =0;
			//System.out.println("Enter a number");
			input=Integer.parseInt(System.console().readLine());
			PrintStream out=new PrintStream (new FileOutputStream("primeoutput.txt"));
						if (input < 2)
			{
				out.print(" There are no prime numbers with in the given input\n"+input);
			}	
			else 
			{
				out.print("The prime numbers until the given input "+input+"are \n");					
				for (int i=2 ; i <= input ;i++)
					{
						count=1;
						if ( i!= 2 && i%2==0 && i<input && i%3==0 )		
							i++;
							
						for(int j=2 ; j <= i; j++)	
						{
							if( i % j == 0 )
							{
							    count++;
								if(count >2)
								{
									break;
								}										      							  
							}  			
						}
						
						if (count == 2)
						{
							out.print( i+"\n");
						}	
						
					}
							
				}
		}
}