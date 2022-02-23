import java.util.*;
import java.lang.*;

class randomnumber extends Thread
{
	int n;
	randomnumber()
	{
		Random r=new Random();
		n=r.nextInt(100);
		start();
	}
	public void run()
	{
		try
		{
			if(n%2==0)
			{
				even e=new even(n);
			}
			else
			{
				odd o=new odd(n);
			}
		}
		catch(Exception e)
		{
			System.out.println("Thread 1 is interuppted.");
		}
	}
}

class even extends Thread
{
	int n;
	even(int n)
	{
		this.n=n;
		start();
	}
	public void run()
	{
		try
		{
			System.out.println(n+"is an even number");
			System.out.println("Square of "+n+"is"+Math.pow(n,2));
		}
		catch(Exception e)
		{
			System.out.println("Thread 2 is interuppted");
		}
	}
}

class odd extends Thread
{
	int n;
	odd(int n)
	{
		this.n=n;
		start();
	}
	public void run()
	{
		try
		{
			System.out.println(n+" is an odd number");
			System.out.println("Cube of "+n+"is"+Math.pow(n,3));
		}
		catch(Exception e)
		{
			System.out.println("Thread 2 is interupted");
		}
	}
}

public class week10
{
	public static void main(String args[])
	{
		int m;	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of numbers to generate:");
		m=sc.nextInt();
		try
		{
			for(int i=0;i<m;i++)
			{
				randomnumber rn=new randomnumber();
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Main thread is interupted");
		}
	}
}
		
