import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the string : ");
	    String str = sc.nextLine();
	    int length  = str.length();
	    int i=0;
	   char arr[] = str.toCharArray();
	   while(i < length)
	    {
	        
	        if(arr[i] >= 'a' && arr[i] <= 'z')
	        {
	            arr[i] = (char)((int)arr[i] - 32);
	        }
	        else if(arr[i] >= 'A' && arr[i] <= 'Z')
	        {
	            arr[i] = (char)((int)arr[i] + 32);
	        }
	      i++;
	    }
	    i=0;
	    System.out.print("String after toggle is : ");
	    while(i < length)
	    {
	        System.out.print(arr[i]);
	        i++;
	    }
	    
	    
	}
}
