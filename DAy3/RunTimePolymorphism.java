package DAy3;

class Parent2 {

	void show() {

		System.out.println("parent class function");

	}

	int data = 10;

}

public class RunTimePolymorphism extends Parent {

	void show() {

		System.out.println("child class function");

	}

	int data = 20;

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Parent2 obj = new Parent2();

		obj.show();

		System.out.println("the value of the data is " + obj.data);

		RunTimePolymorphism obj2 = new RunTimePolymorphism();

		obj2.show();

		System.out.println("the value of the data is " + obj2.data);

		RunTimePolymorphism obj3 = new RunTimePolymorphism();

		obj3.show();

		System.out.println("the value of the data is " + obj3.data);

	}

}