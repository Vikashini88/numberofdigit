import java.util.*;
import java.lang.*;
import java.io.*;
class Vika
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		long c=0L,t=n;
		while(n>0)
		{
			c++;
			n=n/10;
		}
		System.out.println("Number of digits in "+t+" is "+c);
	}
}