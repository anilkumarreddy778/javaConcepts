package intrv_test;

public class V8_swap_two_integer_varables {
	
	public static void main(String[] args)
	{
		
		int x=5; //0101
		int y=10;//1010
		int z;
		// 1 using 3rd variable
//		z=x;
//		x=y;
//		y=z;
//		
//		System.out.println(x);
//		System.out.println(y);
		
		//2 Without using 3rd variable
		x=x+y;//15
		y=x-y;//25
		x=x-y;

		//3 by multiplication 
		x=x*y;
		y=x/y;
		x=x/y;
		
		//4 by using xor : ^
		x=x^y; // 15 - 1111
		y=x^y; // 10 - 1010
		x=x^y; // 5 - 0101
		System.out.println("x value "+x);
		System.out.println("y value "+y);
	}
	

}
