import java.io.*;
import java.util.*;


public class atoz {

public static void main(String[] args )
{

int x=titleToNumber("A");
System.out.println(x);


}



    public  static int titleToNumber(String s) {
    
        StringBuilder str=new StringBuilder(" " );
        int col=0;
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        hm.put('A',1);
        hm.put('B',2);
        hm.put('C',3);
        hm.put('D',4);
        hm.put('E',5);
        hm.put('F',6);
        hm.put('G',7);
        hm.put('H',8);
        hm.put('I',9);
        hm.put('J',10);
        hm.put('K',11);
        hm.put('L',12);
        hm.put('M',13);
        hm.put('N',14);
        hm.put('O',15);
        hm.put('P',16);
        hm.put('Q',17);
        hm.put('R',18);
        hm.put('S',19);
        hm.put('T',20);
        hm.put('U',21);
        hm.put('V',22);
        hm.put('W',23);
        hm.put('X',24);
        hm.put('Y',25);
        hm.put('Z',26);
        str=str.append(s);
		System.out.println(str);
        str=str.reverse();
		System.out.println(str);
        s=str.toString();
		System.out.println(s);
                
        for(int i=0;i<s.length()-1;i++)
        {
            if(i==0)
			{
			    col+=hm.get(s.charAt(i));
			System.out.println(col);
			}
			else			
			{		
				col+=(i)*26*hm.get(s.charAt(i));
			  System.out.println(col);
			}
        }
        
        return col;
	}
}	