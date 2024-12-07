import java.util.*;
public class ConvertStringToAnArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str=sc.nextLine();
		char[] letters=str.toCharArray();
		System.out.print("[ ");
		for(int i=0; i<letters.length; i++){
			System.out.print(" '"+letters[i]+"' ");
		}
		System.out.print(" ]");
	}
}