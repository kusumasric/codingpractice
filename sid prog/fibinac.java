import java.io.*;
import java.util.*;

public class fibinac
{
	static int count=1,n=0;
	public static void main(String[] args)
	{
		n=Integer.parseInt(System.console().readLine("Enter number "));
	    int result=fib(n);			
		System.out.println(result);
	}

	public static int fib(int i)
	{ 
		if(i==0)
			return 0;
		else if(i==1)
			return 1;
		return fib(i-1)+fib(i-2);
			
	}

} 