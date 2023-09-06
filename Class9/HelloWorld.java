package Class9;


//Time Complexity is
//Instead of measuring actual time required in executing each statement
//Time Complexity consider how many each statement executes
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HELLO WORLD"); //Once o(1)
		display();
		
	}
	static void display() {
		int n=8;
		for(int i=0; i<n; i++) {
			System.out.println("Hello world !!!\n"); //O(n)
		}
		
		for(int i=1; i<n; i=i*2) {
			System.out.println("Hello world !!!\n"); //O(log2(n))
		}
		for(int i=2; i<n; i=(int)Math.pow(i,2)) {
			System.out.println("Hello world !!!\n"); //O(log(log((n))
		
	}
	}
}
