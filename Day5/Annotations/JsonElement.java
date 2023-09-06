package Day5.Annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Field level annotation
//This annotation declares one string parameter with the name "key"
//and empty string as a default value

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

public @interface JsonElement {
	public String key()default "";
}