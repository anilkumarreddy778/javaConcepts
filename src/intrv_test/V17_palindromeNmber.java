package intrv_test;

public class V17_palindromeNmber {

	
	public static void ispalindrom(int num) {
		
		System.out.println("Given numb is "+num);
		
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
		
		if(t==sum)
		{
			System.out.println("it's a palindrom ");
		}else {
			System.out.println("not a palindrom");
		}
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		
		ispalindrom(101);
		
	}
}
