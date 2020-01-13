package intrv_test;

public class V9_swap_string_without_temp_third_variable {

	public static void main(String[] args)
	{
		
			String a="java";
		String b="selenium";
		
		//1 append a and b;
		a=a+b;
		//store inital string a in String b;
		b=a.substring(0,a.length()-b.length());//(Start position , End position )
		//store intial string b in string a //It will start printing form 3rd position
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
			
		
	}
}
