import java.util.*;
public class ArrayListLoop{
	
	public static void main(String[] args){
		ArrayList<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(101);
		num.add(2002);
		System.out.println("ArrayList: "+num);
		System.out.println("Length of ArrayList: "+num.size());
		
		for(int i=0; i<num.size(); i++){
			System.out.println("Item Position at "+i+": "+num.get(i));
		}
	}
}