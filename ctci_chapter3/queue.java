import java.io.*;
import java.util.*;


public class queue
{
	public static void main(String[] args)
	{
		Queue <Integer> q1=new LinkedList<Integer>();
		q1.add(1);
		q1.offer(2);
		System.out.println(q1.peek());
		System.out.println(q1);
		q1.poll();
		System.out.println(q1.peek());
		q1.remove();
		System.out.println(q1.peek());
		
	}
}