import java.io.*;
import java.util.*;

public class fact
{
	public static void main(String[] args)
	{
	int n,result=1;
	n=Integer.parseInt(System.console().readLine( "Enter a number"));
	for( int i=n; i >= 1;i-- )
	{
		result=result*i;
		
	}	
	System.out.println(result);
	
	}
	
}