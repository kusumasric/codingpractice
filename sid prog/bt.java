import java.io.*;
import java.util.*;

public class bt
{
	int ele;
	bt left;
	bt right;	
	public bt(int d)
	{
		ele=d;
		left=null;
		right=null;
	}
//	public static bt root=null,th=null;
	public static void main(String[] args)
	{
		bt root=null,th=null;
		String del=System.console().readLine("Enter delimeter");
		String str=System.console().readLine("enter input");
		while(str.equals("exit")!=true)
		{
			String[] s=str.split(del);
			if(s[0].equals("i")==true)
			{
				int d=Integer.parseInt(s[1]);
				bt current=new bt(d);
				if(root==null)
					root=current;
				else
				{	
					th=root;
					insert(current,th);
					
				}	
			}	
			else if(s[0].equals("maxele")==true)
			{
				int result=maxele(root);				  
				System.out.println(result);
			}
			else if(s[0].equals("disp")==true)
				disp(root);
			else
				System.out.println("Wrong input");
			str=System.console().readLine();
		} 
	}
	
	public static void insert(bt cur,bt th)
	{
	
		Random rand=new Random();
		int r=rand.nextInt(2)+1;
		if (r==1)
		{
			if(th.left!=null)	
				insert(cur,th.left);				
			else
				th.left=cur;
		}
		else if(r==2)
		{
			if(th.right!=null)
				insert(cur,th.right);
			else 
				th.right=cur;	
		}
		
	}
	public static void disp(bt dt)
	{		
		if(dt!=null)
			System.out.println(dt.ele);
		if(dt.left!=null)
			disp(dt.left);
		if(dt.right!=null)
			disp(dt.right);
	}
	public static int  maxele(bt rt)
	{
		int maxl=0;
		int maxr=0;
		if(rt==null)
		   return 0;	
        maxl=maxele(rt.left);
		maxr=maxele(rt.right);
		if(rt.left.ele > rt.right.ele && rt.left.ele> rt.ele)
			 return rt.left.ele;
		 else if(rt.right.ele>rt.left.ele && rt.right.ele > rt.ele)
			 return rt.right.ele;
		 return rt.ele;
	}
}