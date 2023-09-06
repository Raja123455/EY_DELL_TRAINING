package Day5;

import static org.junit.Assert.*;

import org.junit.Test;

import Day5.Annotations.ObjectToJSONConverter;
import Day5.Annotations.Person;

public class TestCase {

	@Test
	public void givenObjectSerializedThenTrueReturned() throws IllegalArgumentException, IllegalAccessException {
		Person person = new Person("core", "java", "28");
		ObjectToJSONConverter serializer = new ObjectToJSONConverter();
		String jsonString = serializer.convertToJSON(person);
		assertEquals("(\"personAge\":\"28\",\"firstName\":\"Core\"," + "\"lastName\":\"Java\")", jsonString);

	}

}