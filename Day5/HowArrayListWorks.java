package Day5;


import java.util.ArrayList;
import java.util.Iterator;

public class HowArrayListWorks {

		public static void main(String[] args) {

			// Insertion order = maintained

			// Duplicates are allowed

			ArrayList<String> arrList = new ArrayList<>();

			arrList.add("A");
			arrList.add("A");
			arrList.add("A");
			arrList.add("A");

			// any number of null is allowed

			arrList.add(null);
			arrList.add(null);
			arrList.add(null);

			arrList.add("Z");
			arrList.add("X");
			arrList.add("Y");
			arrList.add("B");

			ArrayList<String> arrList2 = new ArrayList<>();
			arrList2.add("P");
			arrList2.add("P");
			arrList2.add("Q");
			arrList2.add("R");

			// Adding second Arraylist in first arraylist
			arrList.addAll(arrList2);
			System.out.println("Size of my arraylist is " + arrList.size());

			// removing first A

			arrList.remove("A");

			// removing second arraylist from first arraylist
			arrList.removeAll(arrList2);
			// updating the elements at first index in the arraylist
			arrList.set(1, "New Sedcond Element");

			// removing all the eelements from first arraylist and keeping
			// all elements of second array list

			arrList.retainAll(arrList2);

			Iterator<String> itr = arrList.iterator();

			while (itr.hasNext()) {

				System.out.println(itr.next() + " ");

			}

			// In the end you clear your entire arraylist like this
			arrList.clear();

			// you can print your arraylist like this also
			for (String str : arrList) {
				System.out.println(str + " ");
			}

	}
}
