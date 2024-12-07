import java.util.*;
public class AreaOfRectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		float x=sc.nextFloat();
		System.out.print("Enter Width: ");
		float y=sc.nextFloat();
		
		float area = x*y;
		System.out.println("Area Of Rectangle: "+area+" SqFt");
	}
}