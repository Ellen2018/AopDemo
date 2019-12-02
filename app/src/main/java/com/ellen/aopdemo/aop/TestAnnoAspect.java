package com.ellen.aopdemo.aop;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAnnoAspect {

    @Pointcut("execution(@com.ellen.aopdemo.aop.TestAnnoTrace * *(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void before(JoinPoint point) {
        Log.e("Ellen2018","before");
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        Log.e("Ellen2018","around");

        //一定要加上这句话，不然切面的方法不会被调用
        joinPoint.proceed();
    }

    @After("pointcut()")
    public void after(JoinPoint point) {
        Log.e("Ellen2018","After");
    }

    @AfterReturning("pointcut()")
    public void afterReturning(JoinPoint point, Object returnValue) {
        Log.e("Ellen2018","afterReturning");
    }

    @AfterThrowing(value = "pointcut()", throwing = "ex")
    public void afterThrowing(Throwable ex) {
        Log.e("Ellen2018","afterThrowing");
        Log.e("Ellen2018","ex = " + ex.getMessage());
    }
}
