package Annotations.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.METHOD,ElementType.FIELD})
public @interface MyAnnotation {
    String name();
    int id();
    String country = "India";
}
