package intrv_test;

public class V7_String_Manupulation {
	
	
	public static void main(String[] args) {
		
		
		
		String str="Selenium is a automation tool";
		String str2="Selenium is a automation tooL";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('i')); //1st occurrence of i 
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//2nt occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1));//3rd occurrence
		
		System.out.println(str.indexOf("is"));
		System.out.println(str.indexOf("hello"));
		//string comparison
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		
		//substring
		System.out.println(str.substring(0, 8)+"SUBSTRING");
		
		//trim 
		String trim="  hi selenum auto   ";
		System.out.println(trim.trim());
		System.out.println(trim.replace(" ", ""));
		
		//split
		String test= "selenium_is_automation_tool";
		String trr[]=test.split("_");
		for(int i=0;i<trr.length;i++)
		{
		System.out.println(trr[i]);
		}
		
		//concat
		String sel="selenum";
		System.out.println(sel.concat("m"));
		
		String s1="hello";
		String s2="selenum";
		int i1=100;
		int i2=200;
		System.out.println(s1+s2+i1+i2);
		System.out.println(s1+s2+(i1+i2));
		
		//revering string Stringbuffer -it is imutable
	}

}
