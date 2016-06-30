import java.io.*;
import java.util.*;

public class zero {
	
	public static void main(String[] args )
	{
	int[] n=new int[]{1,0,1}	;
		moveZeroes(n);
	}
	
	
    public static void moveZeroes(int[] nums) {
     
     int swap,j;
     for(int i=0;i< nums.length-1 ;i++)
     {
         if(nums[i]==0)         
         { 
            j=i+1;
			if(j< nums.length)
            while( j < nums.length-1 && nums[j]==0 )
                j++;
			if(nums[j]!=0)      
            {
		        swap=nums[j];
                nums[j]=nums[i];
                nums[i]=swap;
            }             
         }
      }
	  
	  for (int i=0;i<nums.length;i++)
	  {
		  System.out.println(nums[i]);
	  }
     
     
     
     
        
    }
}