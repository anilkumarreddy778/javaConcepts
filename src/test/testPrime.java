package test;

public class testPrime {
	
	public static boolean primenum(int num) {
		
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2;i<num;i++)
		{
			
			if(num%i==0)
			{
				return false;
			}
			
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
		
		if(t==sum) {
			System.out.println("it's polindrom");
		}else {System.out.println("not polindrom");}
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
		
		if(t==cube)
		{System.out.println("it's armstrong num");}else {System.out.println("it's not armstrong");}
	}
	
	public static void factroial(int num)
	{
		
		int t=1;
		
		for(int i=2;i<=num;i++)
		{
			
			t=t*i;
		}
		System.out.println(t);
	}
	public static void main(String[] args)
	{
		
		System.out.println(primenum(2));
		polindrom(121);
		armstrong(153);
		factroial(4);
		
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
