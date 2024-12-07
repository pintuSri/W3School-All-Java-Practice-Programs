import java.util.*;
public class HashMapLoop{
	public static void main(String[] args){
		HashMap<String, Integer> student = new HashMap<>();
		student.put("Sridhar",36);
		student.put("Shankar",15);
		student.put("Sharan",34);
		student.put("Sundar",31);
		//System.out.println(student.keySet());
		//System.out.println(student.values());
		
		for(String name: student.keySet()){
			System.out.println(name);
		}
		System.out.println();
		for(Integer age: student.values()){
			System.out.println(age);
		}
		
	}
}