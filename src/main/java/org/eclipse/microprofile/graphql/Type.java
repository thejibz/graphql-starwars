package org.eclipse.microprofile.graphql;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Type {

    String name();

    String description() default "";
}
