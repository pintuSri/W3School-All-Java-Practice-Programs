import java.util.*;
public class PositiveOrNegetive{
	public static void main(String[] args) throws Throwable{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		float num=sc.nextFloat();
		
		try{
			if(num>=0 && num!=34){
				System.out.println("Number is Positive");
			
			}
			else if(num<0){
				System.out.println("Number is Negetive");
			
			}
			else if(num==34){
				System.out.println("Number is 34");
			
			}
			
		}
		catch(Exception e){
			System.out.println("Invalid Input");
		}
		
		
	}
}