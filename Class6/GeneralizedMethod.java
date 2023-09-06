package Class6;

public class GeneralizedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArr = {10,20,30,40,5,23};
		String[] strArr = {"RAJA","Shashank","RANA"};
		
		System.out.println("Printing integer array");
		printArray(intArr);
		
		System.out.println("Printing String array");
		printArray(strArr);
		
		

	}
	
	static<E> void printArray(E[] elements) {
		for(E ele: elements) {
			System.out.println(ele + " ");
		}
		
	}

}
