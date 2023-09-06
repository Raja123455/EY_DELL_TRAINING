package Day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Day5.Annotations.ObjectToJSONConverter;
import Day5.Annotations.Person;

public class TestCase2 {

	@Test

	public void givenObjectSerializedThenTrueReturned() throws IllegalArgumentException, IllegalAccessException {

		Person person = new Person("core", "java", "28");

		ObjectToJSONConverter serializer = new ObjectToJSONConverter();

		String jsonString = serializer.convertToJSON(person);

		assertEquals("{\"personAge\":\"28\",\"firstName\":\"Core\","

				+ "\"lastName\":\"Java\"}", jsonString);

	}

}
