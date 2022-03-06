import java.util.Scanner;
public class Main
{
    public static int[] checking(int[] nums) 
    {
        int[]arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])   count++;
            }
            arr[i]=count;
        }
        return arr;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("ENter the size of array : ");
	    int size = sc.nextInt();
	     int []nums = new int[size]; 
	    System.out.print("Enter the array elements : ");
	    for(int i=0;i<size;i++)
	        nums[i] = sc.nextInt();
	   
	    
       int[]arr=checking(nums);
        System.out.print("output of array elements smaller then current element is : ");
       for(int num:arr)  
       {
           System.out.print(num+" ");
       }
        
	   
	}
}