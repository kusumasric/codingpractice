import java.io.*;
import java.util.*;
// run time is O(constant)
public class threestacks
{
	public static int size;
	public static int[] array=new int[10] 	;
	public static int  ts1,ts2,ts3,ele=0,stacknum=0;
	
	public static void main(String[] args)
	{
		size=Integer.parseInt(System.console().readLine("Enter the size of the three stacks you wish to create :"))	;
		array= new int[size*3];
		ts1=0;
		ts2=size;
		ts3=(size*2);	
		String option;
		option=System.console().readLine("Enter whether you wish to push,pop,peek,display or exit :");
		while (option.equals("exit")==false )
		{	
			if(option.equals("push")==true)
			{	
				ele=Integer.parseInt(System.console().readLine("enter element: "));
				stacknum=Integer.parseInt(System.console().readLine("enter the stack number you wish to insert 1/2/3:"))	;
				push(stacknum,ele)	;
				option=System.console().readLine("Enter whether you wish to push,pop,peek,display or exit :");
				continue;
			}
			else if (option.equals("pop")==true)
			{
				stacknum=Integer.parseInt(System.console().readLine("enter the stack number you wish to pop 1/2/3:"))	;
				int s=pop(stacknum)	;
				System.out.println ( "removed element\t"+s+"from stack\t"+stacknum)	;
				option=System.console().readLine("Enter whether you wish to push,pop,peek,display or exit :");
				continue;
			}
		
			else if(option.equals("peek")== true)
			{
				stacknum=Integer.parseInt(System.console().readLine("enter the stack number you wish to peep 1/2/3:"))	;
				int s=peek(stacknum);
				System.out.println("the top most element in stack\t"+stacknum+ "is\t"+s);
				option=System.console().readLine("Enter whether you wish to push,pop,peek,display or exit :");
				continue;
			}	
			else if(option.equals("display")==true)
			{
				stacknum=Integer.parseInt(System.console().readLine("enter the stack number you wish to display 1/2/3:"))	;
				display(stacknum);			
				option=System.console().readLine("Enter whether you wish to push,pop,peek,display or exit :");
				continue;
			}
			else if(option.equals("exit")==true)
			{
				System.out.println("Exit from  the programs");
				return;
			}	
		
		}
	}
		public static void push(int stack ,int element)	
		{
			int top;
			if(stack==1)
			{	
				top=ts1;
				array[top]=element;		
				ts1++;
			}
			else if(stack==2)
			{	
				top=ts2;
				array[top]=element;
				ts2++;	
			}	
			else if(stack==3)
			{	
				top=ts3;
				array[top]=element;
				ts3++;
			}							
		}
		public static int pop(int stack)	
		{
			int x=0,top;
			if(stack==1)
			{	
				top=ts1-1;
				x=array[top];
				array[top]=0;	
				ts1--;
			}
			else if(stack==2)
			{	
				top=ts2-1;
				x=array[top];
				array[top]=0;
				ts2--;	
			}	
			else if(stack==3)
			{	
				top=ts3-1;
				x=array[top];
				array[top]=0;
				ts3--;
			}	
			return x;
		}
	
		public static int peek(int stack)	
		{
			int x=0,top;
			if(stack==1)
			{
				top=ts1-1;
				x=array[top];	
			}
			else if(stack==2)
			{	
				top=ts2-1;
				x=array[top];
			}	
			else if(stack==3)
			{	
				top=ts3-1;
				x=array[top];
			}	
			return x;
		}
		public static void display(int stack)	
		{
			int disp;
			if(stack==1)
			{
				disp=0;
				while(disp <= size-1)
				System.out.println(array[disp++]+"\t" );							
			}
			else if(stack==2)
			{
				disp=size;
				while(disp <= (size*2)-1)
				System.out.println(array[disp++]+"\t" );					
			}	
			else if(stack==3)
			{
				disp=size*2;
				while(disp <= (size*3)-1)
				System.out.println(array[disp++]+"\t" );			
			}					
		}	
			
}