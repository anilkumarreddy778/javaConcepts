package test;

public class test1 {

	
	
	public static void palindro(int num)
	{
		int revers=0;
		int sum=0;
		int temp;
		
		temp=num;
		
		while(num>0)
		{
			revers=num%10;
			sum=(sum*10)+revers;
			num=num/10;
		}
				
		if(temp==sum)
		{
			System.out.println("it's palindrom num");
		}else
		{
			System.out.println("not palindrom");
		}
	}
	
	
	
	public static void stringpalindro(String str)
	{
		String rev="";
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
			rev=rev+str.charAt(i);
		}
	
		
		System.out.println(str+rev);
		
		if(str.equals(rev))
		{
			System.out.println("it's palindorom");
		}else {
			System.out.println("it's not palidnrom");
		}
	}


	public static boolean prime(int num) {
		
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
	
	
	public static boolean prime2(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i =2;i<num;i++)
		{
			
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	
	public static void polindro(int num)
	{
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
		}else {System.out.println("not polind");}
		
	}
	
	
	
	public static void armstrong(int num) {
		
		int cube=0;
		int rev=0;
		int tem;
		tem=num;
		while(num>0)
		{
			
			rev=num%10;
			num=num/10;
			cube=cube+(rev*rev*rev);
		}
		
		if(tem==cube)
		{
			System.out.println("it's armstrong");
		}else{
			
			System.out.println("not");
		}
	}
	
	public static void main(String[] args) {
		
		
		//palindro(101);
		//stringpalindro("abasd");
		
		//System.out.println(prime(11));
	
		//System.out.println(prime2(25));
		
		armstrong(153);
	}
	
	
	
	public static void duplicate() {
		
		
		
	}

}
