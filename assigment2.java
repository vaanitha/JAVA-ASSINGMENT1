package ASSINGMENT;

public class assigment2 {
	public static void main (String arg[])
	{
		int[] nums= {2,5,7,7,5,9,2,3};
		int j;
		for(int i=0;i<nums.length;i++)
		{
			for( j=i+1;j<nums.length;j++)
			{
				if( nums[i] ==nums[j]){
			  System.out.println("duplicate number" +nums[i]);}
			
			}
			
	}
}}