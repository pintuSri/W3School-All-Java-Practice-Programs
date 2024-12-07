import java.util.*;
public class SortAnArray{
	public static void main(String[] args){
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<num.length; i++){
			System.out.print("Enter Number: ");
			int n=sc.nextInt();
			num[i]=n;
		}
		System.out.println("[ ");
		for(int j=0; j<num.length; j++){
			System.out.print(" '"+num[j]+"' ");
		}
		System.out.println("] ");
		Arrays.sort(num);
		System.out.println("After Sorting Array");
		System.out.println("[ ");
		for(int k=0; k<num.length; k++){
			System.out.print(" '"+num[k]+"' ");
		}
		System.out.println("] ");
		
	}
}