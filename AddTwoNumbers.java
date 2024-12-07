import java.util.*;

public class AddTwoNumbers{
	
	
	public void sum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of X: ");
		int x=sc.nextInt();
		System.out.print("Enter Value of Y: ");
		int y=sc.nextInt();
		
		System.out.println("Sum of X & Y: "+ (x+y));
	}
	
	public void sum(float x, float y){
		System.out.println("Sum of X & Y: "+ (x+y));
	}
	
	public void sum(int x, int y){
		System.out.println("Sum of X & Y: "+ (x+y));
	}
	
	public static void main(String[] args){
		AddTwoNumbers add = new AddTwoNumbers();
		System.out.println("Method-01--DataType: float");
		add.sum(10.2f,12.2f);
		System.out.println("---------------------------------");
		System.out.println("Method-02--User Input");
		add.sum();
		System.out.println("---------------------------------");
		System.out.println("Method-03--DataType: int");
		add.sum(1000,1200);
	}
}