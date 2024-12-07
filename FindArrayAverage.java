import java.util.*;
public class FindArrayAverage{
	public static void main(String[] args){
		float sum = 0;
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<num.length; i++){
			System.out.print("Enter Number: ");
			int n=sc.nextInt();
			num[i]=n;
			sum = sum+num[i];
		}
		System.out.println("Sum of an Array is: "+sum);
		System.out.println("Average of an Array: "+(sum/(num.length)));
	}
}