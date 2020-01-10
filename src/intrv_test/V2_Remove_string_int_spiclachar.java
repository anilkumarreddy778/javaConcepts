package intrv_test;

public class V2_Remove_string_int_spiclachar {

	
	//how do u remove junk character or unwanted characters
	//by using regular expiration
	
	public static void main(String[] args)
	{		
		String s="123213 String TEST *&*^&";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}	
}
