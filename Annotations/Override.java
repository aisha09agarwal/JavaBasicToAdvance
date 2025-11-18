package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface Override {
    
}

// @Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
// public @interface SafeVarargs {
    
// }

//Custom Annotations

// @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})  
// @Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
// public @interface MyAnnotation {
//     String value();
//     int number() default 0;
// }

/*
 * Element Type
 * type
 * field
 * method
 * parameter
 * constructor
 * local variable
 * annotation type
 * package
 * module
 * record
 * type parameter
 * type use
 */
