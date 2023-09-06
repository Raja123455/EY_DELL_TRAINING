package Class10;

public class SwapElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = { 20,2,3,-10,100,12,0,-1 };
		System.out.print("Elements before swapping");
		for(int i:intArr) {
			System.out.println(i + " ");
			
		}
		//Let say we want to swwap elements at 4th index with 2nd index
		int firstIndex=2, secondIndex=4;
		
		//Temp variable
		int temp=intArr[firstIndex];
		
		//swapping
		intArr[firstIndex] =  intArr[secondIndex];
		intArr[secondIndex] = temp;
		
		System.out.print("Elements after swapping 4th index value with 2nd index");
		for(int i:intArr) {
			System.out.println(i + " ");
		}

	}

}
