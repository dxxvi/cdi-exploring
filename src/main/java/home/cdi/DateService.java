package home.cdi;

import home.annotation.MyInterceptorAnnotation;
import home.annotation.MyInterceptorType;

import javax.enterprise.context.RequestScoped;
import java.text.SimpleDateFormat;
import java.util.Date;

@RequestScoped
public class DateService {
    private final Date date;

    public DateService() {
        date = new Date();
    }

    @MyInterceptorAnnotation(/*interceptorType = MyInterceptorType.TWO*/)
    public String getTimeAndDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(date);
    }
}
