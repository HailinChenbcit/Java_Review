package Day10.adam.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RunImmediately {
  int times() default 1;// if not default, have to declare in the method annotation
}
