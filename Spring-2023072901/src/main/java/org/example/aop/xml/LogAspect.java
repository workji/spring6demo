package org.example.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->before notice, method name:" + methodName + ", parameter:" + Arrays.toString(args));
    }

    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->after notice, method name:" + methodName);
    }

    public void afterReturningMethod(JoinPoint joinPoint,Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->return notice, method name:" + methodName + ", result" + result);
    }

    public void afterThrowingMethod(JoinPoint joinPoint,Throwable ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->exception notice, method name:"+methodName+", exception info:"+ex);
    }

    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String argString = Arrays.toString(args);
        Object result = null;
        try {
            System.out.println("around notice == before run");
            result = joinPoint.proceed();

            System.out.println("around notice == after run");
        }catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("around notice == exception run");
        } finally {
            System.out.println("around notice == complete run");
        }
        return result;
    }


}
