package intrv_test;

public class V1_Revers_the_string {
	
	
	public static void main(String[] args)
	{
		
		String s = "selenium";
		String rev="";
		int lenght=s.length();
		for(int i=lenght-1; i>=0;i--)
		
		{
			rev=rev+s.charAt(i);
			//System.out.print(s.charAt(i));
			
		}
		System.out.println(rev);
		
		
		StringBuffer vf=new StringBuffer(s);
		System.out.println(vf.reverse());
	}

}
