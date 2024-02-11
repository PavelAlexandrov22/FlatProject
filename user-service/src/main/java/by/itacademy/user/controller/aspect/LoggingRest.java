package by.itacademy.user.controller.aspect;

import by.itacademy.user.controller.dto.audit.Type;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LoggingRest {
    Type type() default Type.USER;

}