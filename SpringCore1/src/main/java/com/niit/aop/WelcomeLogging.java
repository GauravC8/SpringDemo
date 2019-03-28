package com.niit.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component // marks java class as Bean
@Aspect
public class WelcomeLogging {

	@Before("execution(* com.niit.service.*.*(..))") // Pointcut in Before advice
	public void logBefore() // Advice
	{
		System.out.println("***Welcome to Niit Bank********");
	}

	@After("execution(* com.niit.service.*.*(..))")
	public void logAfter() {
		System.out.println("**********Thank You Visit Again******");
	}
}