package web.aspect;

import org.springframework.stereotype.Component;

import web.other.PointcutAnnotation;

@Component
public class SimpleAspect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	@PointcutAnnotation
	public void simpleAspect(){
		System.out.println("SimpleAspect.simpleAspect()");
	}
	
	public void fun(int i){
		System.out.println("SimpleAspect.fun()");
	}

}
