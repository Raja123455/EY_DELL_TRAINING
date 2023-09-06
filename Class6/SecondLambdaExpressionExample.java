package Class6;

@FunctionalInterface
interface isFunctional{
	void show(String data);
}

public class SecondLambdaExpressionExample {

	public static void main(String[] args) {
		isFunctional obj = new isFunctional () {

			@Override
			public void show(String data) {
				System.out.println("Using anonymous Inner " + data);
			}
		};
		obj.show("Class way of implementation");
		
		isFunctional obj2 = (demoData) -> {
			System.out.println("Elementating Anonymous Inner " + demoData);
			
			
		};
		obj2.show("Using class way of implementation - Through Lambda expression");
		// TODO Auto-generated method stub

	}

}
