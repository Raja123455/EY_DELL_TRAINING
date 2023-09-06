package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HowComparableAndComparatorWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = {10,2,82,93,102,1,4,3};
		Arrays.sort(intArr);
		System.out.println("Sorted Integer Arrays is " + Arrays.toString(intArr));
		
		List<String> listStr = new ArrayList<>();
		listStr.add("Z");listStr.add("A");listStr.add("Z");listStr.add("Z");
		listStr.add("X");listStr.add("Y");
		Collections.sort(listStr);
		for(String str:listStr) {
			System.out.println(str + " ");
		}

	}

}
