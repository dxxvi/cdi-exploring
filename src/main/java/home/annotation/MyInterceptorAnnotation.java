package home.annotation;

import javax.interceptor.InterceptorBinding;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@InterceptorBinding
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented                            // to generate information in Javadoc
public @interface MyInterceptorAnnotation {
//    MyInterceptorType interceptorType() default MyInterceptorType.ONE;

}
