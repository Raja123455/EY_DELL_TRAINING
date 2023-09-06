package DAy3;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte grade = 2;
		short marks = 20;
		float price = 8.3f;
		double rate = 240.3D;
		boolean flag = false;
		char initial = 'A';

		// Autoboxing -- To get a object out of a data type --Wraper class
		Byte bObject = new Byte(grade);
		Short sObject = new Short(marks);
		System.out.println("Data type grade is " + grade);
		System.out.println("Object bObject is " + bObject);

		byte byteValue = bObject.byteValue(); // Unboxing of a wrapper class
		System.out.println(byteValue);
	}

}
