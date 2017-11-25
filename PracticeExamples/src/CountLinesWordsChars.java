import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountLinesWordsChars {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		List<String> listString= new ArrayList<>();
		while(sc.hasNextLine()){
			listString.add(sc.nextLine());
		}
		String[] words= str.split(" ");
		System.out.println(words.length);
		System.out.println(str.length());
		System.out.println(str.replace(" ", "").length());
		System.out.println(listString.size());
	}
}



