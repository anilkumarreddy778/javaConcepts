package intrv_test;

public class V3_Revers_a_integer {
	
	
	public static void main(String[] args)
	{
		
		long num=123453453;
		long rev=0;
		
		while(num !=0) 
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		
		System.out.println(rev);
		long num1=4537479;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		
	}

}
