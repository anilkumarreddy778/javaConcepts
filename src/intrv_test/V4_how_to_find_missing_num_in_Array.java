package intrv_test;

public class V4_how_to_find_missing_num_in_Array {

	
	public static void main(String[] args)
	{
		int arr[]= {-2,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,15};
		int sum =0;
		
		for(int i= 0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			System.out.print(sum+"+");
		}
		System.out.println();
		System.out.println(sum);
		
		int sum1=0;
		for(int j=-2; j<=15;j++)
		{
			sum1=sum1+j;
		}
		System.out.println(sum1);
		
		System.out.println(sum1-sum);
	}
}
