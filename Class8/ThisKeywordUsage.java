package Class8;


	
	public class ThisKeywordUsage {

		//non static instance variable
		int data = 10;
		
		ThisKeywordUsage(){
			int data = 30;
			System.out.println("Local Variable -- data is " + data);
			this.data = data;
			System.out.println("Instance Variable -- data is " + this.data);
		}

		/*
		 * ThisKeyword2(int data){ System.out.println("Local Variable -- data is " +
		 * data); System.out.println("Instance Variable -- data is " + this.data); }
		 */
		void display() {
			int data = 20;
			System.out.println("Local Variable -- data is " + data);
			System.out.println("Instance Variable -- data is " + this.data);
		}
		
		public static void main(String[] args) {
			
			ThisKeywordUsage obj = new ThisKeywordUsage();
			//obj.display();
		}
	}


	

