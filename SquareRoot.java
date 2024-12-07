import java.util.*;

public class SquareRoot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		double res=Math.sqrt(num);
		System.out.println("Square Root Of "+num+" is: "+res);
	}
}