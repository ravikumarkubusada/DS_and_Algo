package interview.coding.problems.customAnnotatoin;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Target(ElementType.FIELD) -- field level
//@Target(ElementType.TYPE)
//@Documented

@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {

	String name() default "Ravi's - CustomAnnotation";

}
