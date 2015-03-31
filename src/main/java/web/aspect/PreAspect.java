package web.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PreAspect {
	
	@Pointcut("@annotation(web.other.PointcutAnnotation)")
	//@Pointcut("bean(simpleAspect)")
	public void targetMethod(){
		
	}
	
	@Before("targetMethod()")
	public void beforeMethod(JoinPoint point){
		System.out.println("PreAspect.beforeMethod()");
	}
	
	@After("targetMethod()")
	public void afterMethod(JoinPoint point){
		System.out.println("PreAspect.afterMethod()");
	}
	
	@Around("targetMethod()")
	public Object aroudMethod(ProceedingJoinPoint point) throws Throwable{
		System.out.println("PreAspect.aroudBeforeMethod()");
		Object obj = point.proceed();
		System.out.println("PreAspect.aroudAfterMethod()");
		return obj;
	}
}
