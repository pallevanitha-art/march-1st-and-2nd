import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the string : ");
	    String f_str = sc.nextLine();
	    System.out.print("Enter the substring : ");
	    String s_str = sc.nextLine();
	    System.out.print("Enter the substring to be replaced  : ");
	    String r_str = sc.nextLine();

	    System.out.print("After replacing : "+f_str.replace(s_str,r_str));
	}
}
