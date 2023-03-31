package org.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE}) // Class, interface (including annotation type), or enum 에 붙을 수 있는 애노테이션이라는 의미.
@Retention(RetentionPolicy.RUNTIME) // 유지기간
public @interface Controller {
}
