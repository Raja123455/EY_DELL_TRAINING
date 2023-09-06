package Day5.Annotations;

@JsonSerializable

public class Person {
	
	@JsonElement
	private String firstNAme;
	public String getFirstNAme() {
		return firstNAme;
	}

	public void setFirstNAme(String firstNAme) {
		this.firstNAme = firstNAme;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@JsonElement
	private String lastName;
	@JsonElement(key="personAge")
	private String age;
	
	private String address;
	
	public Person(String firstName, String lastName) {
		super();
		this.firstNAme = firstName;
		this.lastName = lastName;
		
	}
	
	public Person(String firstName, String lastName, String age) {
		super();
		this.firstNAme = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
