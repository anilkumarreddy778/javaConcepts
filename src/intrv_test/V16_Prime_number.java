package intrv_test;

import java.io.IOException;

// any number divide by 1 or by itself
public class V16_Prime_number {

	public static boolean isprimnum(int num) {
		
		
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}
	
	
	public static void getprimnumber(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(isprimnum(i))
				System.out.print(i +" ");
		}
	}

	public static void main(String[] args) throws IOException {

//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		// Reading data using readLine
//		String name = reader.readLine();

		System.out.println("100 is a prim number : "+isprimnum(6) );
		getprimnumber(100);

	}

}
