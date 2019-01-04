package org.eclipse.microprofile.graphql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface Argument {

    String name();

    String description() default "";

    String defaultValue() default "";

    Class<?> defaultValueProvider() default Object.class;
}