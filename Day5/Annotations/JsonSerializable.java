package Day5.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//First step toward creating the custom annotation is to declare using keyword interface
//Next to add meta data - Runtime visibility - Type mean it can
//apply to clases

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)



public @interface JsonSerializable {

}
