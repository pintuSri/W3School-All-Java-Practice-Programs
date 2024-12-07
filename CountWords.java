import java.util.*;
public class CountWords{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Sentence: ");
		String str = sc.nextLine();
		String[] temp=str.split(" ");
		System.out.println("Number of Words: "+temp.length);
	}
}