package Day5;

import java.util.Iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<>();

		list.add("A");

		list.add("A");

		list.add("A");

		list.add("A");

		// any number of null is allowed

		list.add(null);

		list.add(null);

		list.add(null);

		list.add(null);

		list.add("A");

		list.add("B");

		list.add("C");

		list.add("D");

		list.addFirst("Firsy Element");

		list.addLast("Last Element");

		Object firstElement = list.getFirst();

		System.out.println("First Element is" + firstElement);

		Object lastElement = list.getLast();

		System.out.println("last Element is" + lastElement);

		int position = list.indexOf("Z");

		System.out.println("Posttion of z" + position);

		int lastPositionOfA = list.lastIndexOf("A");

		System.out.println("Position of last a is" + lastPositionOfA);

		list.add(0, "Add elements at the zeroth index");

		list.remove(2);// removed elements from the second index

		list.removeFirst();

		list.removeLast();

		list.removeFirstOccurrence("A");

		list.removeLastOccurrence("A");

		Object o = list.poll();// return and remove first itemm from the list

		Object o2 = list.pollLast();// return and removes last element from the list

		ListIterator<String> listItr = list.listIterator();
		while (listItr.hasNext()) {

			System.out.println(listItr.next() + " ");
		}
		
		
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next() + " ");

		}

	}

}