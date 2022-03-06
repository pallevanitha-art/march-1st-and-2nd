import java.util.Scanner;
public class Main
{
    static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");
         
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println(reverseString);
         
    }
    
    
    
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
	    String mv = new String(arr);
	    reverseEachWordOfString(mv);
	   
	}
}