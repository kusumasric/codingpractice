import java.io.*;
import java.util.*;

public class bstwhile
{
 
	int data;
	bstwhile left;
    bstwhile right;

	public  bstwhile(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;		
	}
	public static bstwhile root=null,th=null,current=null;
	public static void main(String[] args)
	{
		String opt;
		int ele;
		opt=System.console().readLine(" Enter  whether you want to insert/display/exit :");
		while(opt.equals("exit") != true)
		{
			
			if(opt.equals("insert") == true)
			{
				ele=Integer.parseInt(System.console().readLine("Enter element you wish to insert or -1 to exit: "));
				while(ele >=0  )
				{	
					current=new bstwhile(ele);
					if (root==null)
					{
						root=current;
						ele=Integer.parseInt(System.console().readLine("Enter element you wish to insert or -1:"));
						continue;
					}
					else
					{
						th=root;
						insert (th,ele);
						ele=Integer.parseInt(System.console().readLine("Enter element you wish to insert or -1:"));
						continue;			
					}	
				}
				if(ele == -1)
					opt=System.console().readLine(" Enter whether you want to insert/display/exit "  );	
					continue;
				   
			}			
			else if(opt.equals("exit") == true)
			{
				System.out.println ("Typed exit command");
				return;
			}	
			

			else if(opt.equals("display")== true)
			{
				th=root;
				display(th)	;
			}	
			opt=System.console().readLine(" Enter  whether you want to insert/display/exit :");		
		}		
	}
	public static void insert(bstwhile t,int d)
	{
		while(t.left !=null || t.right!=null )	
		{
			if(d<=t.data && t.left!=null)
			{	
				t=t.left;
				continue;
			}
			else if(d>t.data && t.right!=null)
			{
				t=t.right;
				continue;				
			}	
			else
				break;
		}	
		if(d<=t.data)
			t.left=current;
		else
			t.right=current;
		
	}		
	public static void display(bstwhile t)
	{
		String opt1=System.console().readLine("enter preorder /inorder/postorder /levelorder");
		if (opt1.equals("inorder") == true)
			inorder(t);
		/*else if(opt1.equals("preorder")== true) 
			preorder(t);
		else if (opt1.equals("postorder")== true)
			postorder(t);
		else
			levelorder(t);
	*/}
	
	public static void inorder(bstwhile tt) 
	{
		if(tt.left != null )
		    inorder(tt.left);
		System.out.println(tt.data);
		if(tt.right!=null)
			inorder(tt.right);
			
	}
	



}
