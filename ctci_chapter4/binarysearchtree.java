import java.io.*;
import java.util.*;

public class binarysearchtree 
{
	int data;
	binarysearchtree left=null;
	binarysearchtree right=null;
		
	public binarysearchtree(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
	public  static  binarysearchtree th=null,root=null,current=null;
	 
	public static void main(String[] args)
	{
		String opt,disp;
		int ele;
		
		//PrintStream out=new PrintStream(new FileOutputStream("outputbst.txt"));	
		//System.setOut(out);		
		opt=System.console().readLine("enter whether you would like to insert,remove,search,display,exit:");
		while(opt.equals("exit")==false )
		{
			if(opt.equals("insert")==true)	
			{
				ele=Integer.parseInt(System.console().readLine("Enter element to insert or -1 to exit\n"));
			   
				while(ele >= 0 )
				{
					current=new binarysearchtree(ele);
					if(root==null) 
					{
						root=current;
						ele=Integer.parseInt(System.console().readLine("Enter element to insert or -1\n"));
						continue;
					}
					else
					{
						th=root;
				        insert(th,ele) ;
						ele=Integer.parseInt(System.console().readLine("Enter element to insert or -1\n"));
						continue;				
					}						
				}
				if(ele <= -1)
					opt=System.console().readLine("enter whether you would like to insert,remove,search,display,exit:");
					continue;
			}
			else if(opt.equals("remove")==true)
			{
				System.out.println("enter the command remove\n");
					opt=System.console().readLine("enter whether you would like to insert,remove,search,display,exit:");
					continue;
			}	
			
			else if(opt.equals("search")==true)
			{
						
				System.out.println("enter the command search\n");
					opt=System.console().readLine("enter whether you would like to insert,remove,search,display,exit:");
					continue;
			}	
			
			
			else if (opt.equals("display")==true)
			{
				th=root;
				disp=System.console().readLine("Enter whether you would like to view  levelorder,inorder,preorder,postorder :");
				if(disp.equals("levelorder")==true)
					levelorder(th);
				else if(disp.equals("inorder")==true)
					inorder(th);
				else if(disp.equals("preorder")==true)
					preorder(th);
				else if(disp.equals("postorder")==true)
					postorder(th);					
				opt=System.console().readLine("enter whether you would like to insert,remove,search,display,exit:");
					continue;				
			}	
		}		
	}
	
	public static void insert (binarysearchtree t,int e)
	{		
		if(e <= t.data )
		{	
			if(t.left !=null )
				insert(t.left,e);
			else
				t.left=current;	
		}
		else
		{ 
			if(t.right!=null)
				insert(t.right,e);
			else
				t.right=current;	
		}
	}
	
	public static void levelorder(binarysearchtree t)
	{
		binarysearchtree cur;
	  	Queue <binarysearchtree> q1=new LinkedList<binarysearchtree>();
		if(t==root)
			q1.add(t);
		while(q1.isEmpty() != true)
		{	
			cur=q1.peek();
			System.out.println(cur.data);
			 
			if( cur.left !=null)
				q1.add(cur.left)	;
			
			if(cur.right !=null)
				q1.add(cur.right) 	;
			q1.remove();
					
		}
	}	
	public static void inorder(binarysearchtree t)
	{		
		if(t.left !=null)	
			inorder( t.left);	
		System.out.println(t.data);
		if(t.right !=null)
			inorder(t.right);		
	}
	public static void preorder(binarysearchtree t)
	{
		System.out.println(t.data);
		if(t.left != null)
			preorder(t.left);
		if(t.right != null)
			preorder(t.right);	
	}
	public static void postorder(binarysearchtree t)
	{
		if(t.left!=null)
			postorder(t.left);
		if(t.right !=null)
			postorder(t.right);
		System.out.println(t.data);		
		
	}
	
	
	
	
	
	
}