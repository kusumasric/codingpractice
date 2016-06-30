import java.io.*;
import java.util.*;

public class factorial
{
	public static void main(String[] args)
	{
		int no=Integer.parseInt(System.console().readLine("Enter the number"));
		int s=fact(no);
	   
	   System.out.println(s);
	
	}
	public static int fact(int n)
	{		
		if(n == 1)		
	      return 1;
        else
          return n*fact(n-1);
	      		
	}
	
}