package Day5;

import java.util.Map.Entry;

public class LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap hMap = new LinkedHashMap();
		Book b1 = new Book(1, "Shashank", "ora1cle", "Book1", 10);

		Book b2 = new Book(12, "Ishwor", "oracle", "Book2", 100);
                           
		Book b3 = new Book(31, "RAJA", "oracle2", "book3", 800);
		
		hMap.put(123, b1);
		hMap.put(135, b2);
		hMap.put(121, b3);
		
		for(Entry<Integer, Book> m:hMap.entrySet()) {
			int key=m.getKey();
			Book b = m.getValue();
			System.out.println("Key" + key + "details are : ");
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		
		}
		

	}

	private Entry<Integer, Book>[] entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	private void put(int i, Book b1) {
		// TODO Auto-generated method stub
		
	}

}
