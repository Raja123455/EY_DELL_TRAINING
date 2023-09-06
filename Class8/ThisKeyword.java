package Class8;

public class ThisKeyword {
	

		public static void main(String[] args) {
			ThisKeyword obj = new ThisKeyword();
			System.out.println(obj);
			obj.display();
			
			ThisKeyword obj2 = new ThisKeyword();
			System.out.println(obj2);
			obj2.display();
		}
		
		void display() {
			System.out.println(this);
		}
	}


