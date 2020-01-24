package test;

import java.sql.Array;

public class testPrime {
	
	public static boolean primenum(int num) {
		System.out.print(num+ " is given number : ");
		if(num<=1)
		{return false;}
		for(int i=2;i<num;i++)
		{
			if(num%i==0) {return false;} 
				}
		return true;
	}
	
	public static void polindrom(int num) {
		int r=0;
		int sum=0;
		int t;
		t=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(sum==t) {System.out.println("it's polindrom");}else {System.out.println("it's not polindrom");}
	}
	
	public static void armstrong(int num) {
		int cube=0;
		int r=0;
		int t;
		t=num;
		while(num>0)
		{
			r=num%10;
			cube=cube+(r*r*r);
			num=num/10;
		}
		if(cube==t) {System.out.println("it's armstrong");}else {System.out.println("it's not armstrong");}
	}
	public static void factroial(int num) {int fact=1;
	for(int i=1;i<=num;i++)
		{
		fact=fact*i;
		}
	System.out.println(fact);
	}
	public static void main(String[] args)
	{
		
		int num =20;
		for(int i=0;i<=num;i++)
		{
		System.out.println(primenum(i));
		}
		polindrom(123321);
		armstrong(407);
		factroial(4);
		
		String test[];
		test=new String[10];
		test[0]="anil";
		test[1]="kiran";
		test[2]="ram";
		test[3]="sree";
		test[4]="rahul";
		int test2[]=new int[10];
		test2[0]=10;
		

		// Array st=new Array();
		
		//declaration
		int arr[];
		//allocating memory
		arr= new int[5];
		//intializeing
		arr[0]=10;
		arr[1]=20;
		arr[2]=50;
		arr[3]=30;
		//arr[0]=340;
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" : "+test[i]);
		}
		//System.out.println("120 is prime numb ::"+prime(2));
//		int num=100;
//		for(int i =0;i<=num;i++)
//		{
//			
//			if(prime(i)) {
//			System.out.println(i+" ");
//			}else {
//				System.out.println(i+" not");
//			}
//			
//		}
	}
	
	
}
