package intrv_test;

public class V10_final_finally_finalize {
	
	public static void main(String[] args)
	{
		
		final int i= 10; //constant value - to prevent inheritance - overridden/override/overrides/overrider the methods 
		
		// finally is used in try catch block - finally declared  block will get executing mandatory
		
		// finalize - garbage collection - clean up process  - for unused objects 
		
		dividsion(); 
		System.gc();
		
		
	}
	
	public static void dividsion() {
		
		int i=10;
		try {
			int k=i/0;
		}catch (ArithmeticException e)
		{
			System.out.println("error");
		}
	finally {
		
		System.out.println("out catch");
		}
	}

}
