package Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(java.lang.annotation.ElementType.FIELD)
public @interface ToString {
    String name() default "";

    boolean uppercase() default false;

    String separator() default ",";
}
