import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		String s1= sc.next();
		
		if((s+s).contains(s1) && s.length()!=s1.length()) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
