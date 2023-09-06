package Day5;
import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		//10 is initial capcity and 5 is load factor
		Vector<String> vec = new Vector<> (10,5);
		
		vec.addElement("Z");vec.addElement("Z");vec.addElement("Z");vec.addElement("Z");
		vec.addElement("A");vec.addElement("X");vec.addElement("B");
		vec.addElement("P");vec.addElement("P");vec.addElement("R");
		vec.addElement("M");
		
		System.out.println("Size of vector is " + vec.size());
		System.out.println("Capacity of vector is " + vec.capacity());
		
		Enumeration<String> en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement() + " ");
		}
		
		
		// TODO Auto-generated method stub

	}

}
