import java.util.Scanner;
//import java.util.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.util.Calendar;

public class smh
{
	public void testing()
	{
		System.out.println("hello world");
	}
	public static void main(String args[])
	{
		int y1,m1,d1,y2,m2,d2,agey,agem,aged;
		Boolean b=false;
		String name;
		Scanner input=new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		y2 = now.get(Calendar.YEAR);
		m2 = now.get(Calendar.MONTH)+1;
		d2 = now.get(Calendar.DATE);
		System.out.println("Please enter your name:\n");
		name=input.nextLine();
		System.out.println("please enter your year of birth in 4 digits\n");
		y1=input.nextInt();		
		while ( (y1 == 0) || (y1 > y2) )
		{
			System.out.println("The value that you have entered is invalid.Please re-enter \n");
			y1=input.nextInt();
		}
		
		System.out.println("please enter your month of birth\n ");
		m1=input.nextInt();
		while ((m1 == 0) || (m1 > 12))
		{
			System.out.println("The value that you have entered is invalid.Please re-enter \n");
			m1=input.nextInt();
		}
		System.out.println("please enter your date of birth\n");
		d1=input.nextInt();
		
		while ((d1 == 0) || (d1> 30))
		{
			System.out.println("The value that you have entered is invalid.Please re-enter \n");
			d1=input.nextInt();
		}
		System.out.println("your name is\t"+name);
		System.out.println("The date of birth you entered is:  "+y1+"year\t"+m1+"month\t"+d1+"day\n");
		//DateFormat df = new SimpleDateFormat(" Todays date is " +"dd/MM/YY");
		//Date cd=new Date();
		//System.out.println(df.format(cd));
		
		System.out.println("Today's date is :  "+y2+"year\t"+m2+"month\t"+d2+"day\n");
		agey=y2-y1;
		agem=m2-m1;
		aged=d2-d1;
		
		if (agey == 0 && agem ==0)
			System.out.println("your age is "+aged+"days\n");
		else if (agey == 0)
			System.out.println("your age is"+agem+"months");
		else if(m1 < m2 )
			System.out.println( "your age is"+agey+"years\t"+agem+"months\n");
		else if(m1 > m2){
			agey=agey-1;
			agem=agem+12;	
			System.out.println( " your age is"+agey+"years\t"+agem+"months\n");	
		} else if(m1 == m2){
			aged=d2-d1;
			System.out.println("your age is "+agey+"years\t"+aged+"days\n")	;
		}
		
		if (m2==m1 && d2==d1)
			System.out.println("WISH YOU A VERY HAPPY BIRTHDAY DEAR \t "+name);
	
	}
	
}