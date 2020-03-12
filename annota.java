package com.example;
import java.lang.annotation.*;
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface annota {
	String value() default "yoyo";
}
