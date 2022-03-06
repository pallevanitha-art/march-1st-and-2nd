import java.util.Scanner;
public class Main
{
    public static String truncate(String value, int length) {
        if (value.length() > length) {
            return value.substring(0, length);
        } else {
            return value;
        }
    }
    
    
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the string : ");
	    String test = sc.nextLine();
	     System.out.print("Enter the value tobe truncated the string : ");
       int value  = sc.nextInt();
       
        String result1 = truncate(test, value);
        System.out.println(result1);
        
        
	   
	}
}