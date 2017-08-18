package example;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Dias on 18/08/2017.
 */
@Aspect
@Component
public class Logging {
    @Pointcut("execution(* example..*.*(..))")
    public void allMethods() {
    }

    @AfterThrowing(pointcut = "allMethods()", throwing = "e")
    public void AfterThrowingAdvice(Throwable e){
        System.out.println("There has been an exception: " + e.toString());
    }
}