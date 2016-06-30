import java.io.*;
import java.util.*;

public class Solution {

public static void main(String[] args)
{
String a=System.console().readLine("Enter string");
 int z=titleToNumber(a) ;
 System.out.println(z);

}


    public static  int titleToNumber(String s) {
    
        
        int col=0;
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
      String st= System.console().readLine("Enter yes to add  or exit ");
       while(st.equals("exit")==false)
       {
            st= System.console().readLine("Enter string to column");
            if(st.equals("exit")==true)
              break;
            else
            {
                col=Integer.parseInt(System.console().readLine("enter column number"));
                hm.put(st,col);
                st= System.console().readLine("Enter yes to add  or exit ");
                 continue;
      
             }
       }
       
      s=System.console().readLine("enter a string") ;
     int result=hm.get(s);
     return result;
  }
  }         