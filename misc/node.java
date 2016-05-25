import java.io.*;
import java.util.*;

public class node
{
	public int data;
	public node next;
	
	public node(int d)
	{
		data=d;
		next=null;
	}

public static void main(String[] args)
{
	int d1;
	System.out.println("Enter data\n");
	d1=Integer.parseInt(System.console().readLine());
	node current=new node(d1);
	node th=current;
	while(th.next!= null)
	{
		th=th.next;
	}
	th.next=null;	
}
}		