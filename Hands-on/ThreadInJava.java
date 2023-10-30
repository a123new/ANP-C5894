package com.threads;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0; i<=100; i++)
		{
			System.out.println(Thread.currentThread().getName() +" : " +i);
		}
	}
	
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=101; i<=200; i++)
		{
			System.out.println(Thread.currentThread().getName() +" : " +i);
		}
	}
}

public class ThreadInJava 
{

	public static void main(String[] args) 
	{
	
		Thread1 t1=new Thread1();
		t1.setName("Thread1");
		t1.setPriority(7);
		t1.start();
		
		System.out.println("ye main thread ka task hai");
		Thread2 t2=new Thread2();
		t2.setName("Thread2");
		t2.setPriority(1);
		t2.start();
		
	}

}
