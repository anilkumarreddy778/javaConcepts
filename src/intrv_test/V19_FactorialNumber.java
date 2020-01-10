package intrv_test;

public class V19_FactorialNumber {

	//5 = 1*2*3*4*5
	
	//1) without recursive 
	public static int fact(int num)
	{
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			
			fact=fact*i;
			
		}
		return fact;
	}
	
	//2) with recursive function - a function calling it's 
	
	public static int factre(int num)
	{
		if(num==0)
			return 1;
		return (num*(fact(num-1)));
	}
	
	public static void main(String[] args)
	{
		
		//System.out.println(fact(0));
		
		System.out.println(factre(0));
	}
}
