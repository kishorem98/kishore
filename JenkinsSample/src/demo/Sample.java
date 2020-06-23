package demo;

import java.util.Scanner;

public class Sample {
public int add(int a, int b)
{
	return a+b;
}
public static void main( String args[]) 
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	Sample s= new Sample();
	int sum=s.add(a, b);
	System.out.println("sum= "+sum);
}
}
