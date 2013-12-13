package home.interceptor;

import home.annotation.MyInterceptorAnnotation;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.lang.reflect.Method;

@MyInterceptorAnnotation
@Interceptor
public class MyInterceptor {
    @AroundInvoke
    public Object theOnlyMethodInThisInterceptor(InvocationContext invocationContext) throws Exception {
        Object target = invocationContext.getTarget();
        Method method = invocationContext.getMethod();
        MyInterceptorAnnotation myInterceptorAnnotation = method.getAnnotation(MyInterceptorAnnotation.class);

        System.out.println("You're passing this interceptor with " + myInterceptorAnnotation.interceptorType() +
                " for " + target.getClass().getName() + "." + method.getName());

        return invocationContext.proceed();
    }
}
