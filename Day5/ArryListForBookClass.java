package Day5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryListForBookClass {

	public static void main(String[] args) {

		ArrayList<Book> arrList = new ArrayList<>();

		Book b1 = new Book(1, "A", "RAJA", "C", 10);
		Book b2 = new Book(12, "P", "RAM", "R", 100);
		Book b3 = new Book(13, "M", "RAJ", "O", 1000);

		arrList.add(b1);
		arrList.add(b1);
		arrList.add(b1);
		arrList.add(b3);
		arrList.add(b2);
		arrList.add(b2);

		for (Book b : arrList) {
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		}

		Iterator<Book> itr = arrList.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		}
		// TODO Auto-generated method stub

	}

}




