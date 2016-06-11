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
		int ele,searchele,delele;
		
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
				delele=Integer.parseInt(System.console().readLine("enter element to delete"));
				System.out.println("enter the command remove\n");
				del(delele);
					opt=System.console().readLine("enter whether you would like to insert,remove,search,display,exit:");
					continue;
			}	
			
			else if(opt.equals("search")==true)
			{
						
				System.out.println("enter the command search\n");
				searchele=Integer.parseInt(System.console().readLine("Enter search element"));
				search(searchele);
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
	
	public static void search( int sele)
	{
		th=root;
		while(th.data != sele )
		{	
			if(sele< th.data )
			{
				if(th.left!=null)
				{	
					th=th.left;
					continue;
				}
				else
					break;	
			}	
			else if(sele>th.data)
			{	
				if(th.right !=null)
				{			
					th=th.right;
					continue;
				}
				else
					break;					
			}				
		}			
		if (sele==th.data)
			System.out.println("element found");
		else
			System.out.println("element not found");			
	}
	
	public static void del(int de)
	{
		binarysearchtree rem=null,rightnext=null,leftnext=null;
		th=root;
		if(de==root.data)
		{
			root.left.right=root.right;
			root=root.left;
		}	
		while(de !=th.data)
		{	
			if(de<th.left.data && th.left!=null)
			{
				rem=th;
				th=th.left;
				continue;				
			}	
			else if(de>th.right.data && th.right!= null)
			{	
				rem=th;
				th=th.right;
				continue;	
			}
			else
				break;
		}	
		if(de==th.data)
		{
			if( de < root.data && th.right!=null  )
			{
				rightnext=th.right;
				rightnext.left=th.left;
				rem.left=rightnext;
			}
			else if(de < root.data  && th.right==null)
			{	
				rem.left=th.left;			
			}
			
			else if(de >root.data && th.left!=null)
			{
				leftnext=th.left;
				leftnext.right=th.right;
				rem.right=leftnext;				
			}	
			else if ( de > root.data  && th.left==null )
			{
				rem.right=th.right;
			}
			System.out.println("element deleted");
			
		}	
		
		else
			System.out.println("Entered wrong element")	;			
	}
	
	
}