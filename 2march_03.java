import java.util.Scanner;
public class Main
{
    public static boolean checkString(String str) {
    char ch;
    boolean capitalFlag = false;
    boolean lowerCaseFlag = false;
    boolean numberFlag = false;
    for(int i=0;i < str.length();i++) {
        ch = str.charAt(i);
        if( Character.isDigit(ch)) {
            numberFlag = true;
        }
        else if (Character.isUpperCase(ch)) {
            capitalFlag = true;
        } else if (Character.isLowerCase(ch)) {
            lowerCaseFlag = true;
        }
        if(numberFlag && capitalFlag && lowerCaseFlag)
            return true;
    }
    return false;
}
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the string  of array : ");
	    String string = sc.nextLine();
        boolean result = checkString(string);
        
        if(result  == true)
        System.out.print("Valid");
        else
        System.out.print("Invalid");
	   
	}
}