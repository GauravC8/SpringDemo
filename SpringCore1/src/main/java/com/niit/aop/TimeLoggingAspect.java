package com.niit.aop;

import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component //marks java class as Bean
@Aspect
public class TimeLoggingAspect {

	@Before("execution(* com.niit.service.*.*(..))") //Pointcut in Before advice
	public void logBefore() //Advice
	{
		System.out.println("@Before :" + new Date());
	}
	
	@After("execution(* com.niit.service.*.*(..))")
	public void logAfter() {
		System.out.println("@After :" + new Date());
	}
	
	@AfterReturning(pointcut = "execution(* com.niit.service.*.*(..))",returning="val")
	public void logAfterReturning(Object val)
	{
		System.out.println("Method returning value :" + val);
		System.out.println("@AfterReturning :" +new Date());
	}
	
	@AfterThrowing(pointcut = "execution(* com.niit.service.*.*(..))",throwing="exception")
	public void logAfterThrowing(Exception exception)
	{
		System.out.println("@AfterThrowing :" +new Date());
		System.out.println("Exception Caught :" + exception.getMessage());
	}
}