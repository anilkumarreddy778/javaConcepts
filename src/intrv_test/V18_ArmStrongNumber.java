package intrv_test;

public class V18_ArmStrongNumber {

	//153 , 407, 370 , 371
	//1*1*1=1
	//5*5*5=125
	//3*3*3=27
	//1+125+27=153
	
	
	public static void armstrongnum(int num)
	{
		
		int cube=0;
		int r;
		int t;
		
		t=num;
		
		while(num>0) 
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		
		if(t==cube)
		{
			System.out.println("it's armstrongnum");
		}else {
			
			System.out.println("not armstrong");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		for(int i=0;i<=153;i++)
		{
			System.out.print(i+ " is ");
		armstrongnum(i);
		}
	}

}
