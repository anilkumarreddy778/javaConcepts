package intrv_test;

public class V3_Revers_a_integer {
	
	
	public static void ReverseanInteger(int k) {

		  int r;
		  while(k>0)
		  {
		   r=k%10;
		   k=k/10;
		   System.out.print(r); 
		  }
		  System.out.println();
		 }

		public static void rever(int num) {
			
			String numdd=Integer.toString(num);
			
			for(int i=numdd.length()-1;i>=0;i--)
			{
				System.out.print(numdd.charAt(i));
			}
			System.out.println("");
		}
	
	
	public static void main(String[] args)
	{
		//1st type
		ReverseanInteger(420);
		
		rever(4565);
		//2nd type
		long num=1201;
		long rev=0;
		while(num !=0)
		{
			long ff=num%10;
			rev=rev*10+num%10; // % -mod
			num=num/10;
		}
		System.out.println(rev);
		
		//3rd type
		int nudm=465;
		long num1=4537479;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		System.out.println(new StringBuffer(Integer.valueOf(nudm)).reverse());
	}

}
