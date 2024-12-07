import java.util.*;
public class EvenOrOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		float num=sc.nextFloat();
		if(num%2==0){
			System.out.println("Number is Even");
		}
		else{
			System.out.println("Number is Odd");
		}
	}
}