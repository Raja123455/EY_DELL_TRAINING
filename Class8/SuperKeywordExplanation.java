package Class8;

class Parent {

	void show() {
		System.out.println("Parent class function - Show");
	}

	int data = 10;
}

public class SuperKeywordExplanation extends Parent {

	// TODO Auto-generated method stub

	@Override
	void show() {
		System.out.println("Child class function - show");
	}

	int data = 30;

	void display() {
		System.out.println("The value of current class object is " + this.data);
		System.out.println("The value of immediate parent class object is " + super.data);
		this.show();
		super.show();
	}

	public static void main(String[] args) {
		SuperKeywordExplanation obj = new SuperKeywordExplanation();
		obj.display();
	}

}
