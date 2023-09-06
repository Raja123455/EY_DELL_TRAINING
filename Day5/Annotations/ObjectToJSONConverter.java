package Day5.Annotations; 

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class ObjectToJSONConverter {

	public String convertToJSON(Object obj) {
		
		try {
			CheckIfSerializable(obj);
			initializeObject(obj);
			return getJsonString(obj);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	private void initializeObject(Object obj) {
		// TODO Auto-generated method stub
		
	}
//	private String getJsonString(Object obj) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	private void CheckIfSerializable(Object obj) throws JsonSerializableException {
		if(Objects.isNull(obj)) {
			throw new JsonSerializableException("can't serialize null object");
		}
		
		Class<?> clazz=obj.getClass();
		if(!clazz.isAnnotationPresent(JsonSerializable.class)) {
			throw new JsonSerializableException("This class" + clazz.getCanonicalName() + "is not annoted with " + " Json serializable annotation");
		}
		// TODO Auto-generated method stub
		
	}
	
	private void initializeObject1(Object object) throws IllegalAccessException, InvocationTargetException {
	
	Class<?> clazz=object.getClass();
	for(Method method : clazz.getDeclaredMethods()) {
		method.setAccessible(true);
		method.invoke(object);
	}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
