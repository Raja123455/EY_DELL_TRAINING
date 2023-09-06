package Class6;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
	abstract void draw();

}

class Rectangle extends Shape {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Rectangle");

	}

}

class Square extends Shape {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Square");

	}

}

class Circle extends Shape {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Circle");

	}

}

public class UpperBoundWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Rectangle> listRect = new ArrayList<>();
		listRect.add(new Rectangle());
		listRect.add(new Rectangle());

		List<Square> listSquare = new ArrayList<>();
		listSquare.add(new Square());

		List<Circle> listCircle = new ArrayList<>();
		listCircle.add(new Circle());

		drawShape(listRect);
		drawShape(listCircle);
		drawShape(listSquare);
	}

	static void drawShape(List<? extends Shape> list) {
		for (Shape s : list) {
			s.draw();
		}
	}

}
