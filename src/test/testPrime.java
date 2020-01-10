package test;

public class testPrime {
	
	public static boolean prime(int num)
	{
		
		if(num<2)
		{
			return false;
		}
		
		for(int i=2; i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		
		//System.out.println("120 is prime numb ::"+prime(2));
		int num=100;
		for(int i =0;i<=num;i++)
		{
			
			if(prime(i)) {
			System.out.println(i+" ");
			}else {
				System.out.println(i+" not");
			}
			
		}
	}
}
