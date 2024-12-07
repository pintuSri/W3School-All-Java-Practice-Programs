public class FindSmallestElement{
	public static void main(String[] args){
		int[] num = {0,-23,20,100,2};
		int smallest = num[0];
		for(int i=0; i<num.length; i++){
			if(smallest>num[i]){
				smallest=num[i];
			}
			else{
				continue;
			}
		}
		System.out.println(smallest);
	}
}