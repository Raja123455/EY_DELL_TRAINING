package Class6;
class MyGeneralizedClass<T> {
	T obj;
	void add(T obj) {
		this.obj=obj;
	}
	
	T get() {
		return obj;
	}
}

public class UseofGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGeneralizedClass<Integer> intType= new MyGeneralizedClass<>();
		intType.add(21);
		
		System.out.println(intType.get());
		
		intType.add(31);
		
		//intType.add("ABC") Compile Time error will come if i try to add
		//any other data apart from integer
		
		System.out.println(intType.get());
		
		MyGeneralizedClass<Boolean> boolType= new MyGeneralizedClass<>();
		boolType.add(true);
		
		System.out.println(boolType.get());
		
		MyGeneralizedClass<String> strType= new MyGeneralizedClass<>();
		strType.add("RAJA");
		
		System.out.println(strType.get());

	}

}
