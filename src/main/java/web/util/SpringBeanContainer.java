package web.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanContainer {
	
	private static ApplicationContext sSpringApplicationContext = null;
	
	static{
		initApplicationContext();
	}
	
	private static void initApplicationContext(){
		if (sSpringApplicationContext == null) {
			sSpringApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		}
	}
	
	public static Object getSpringBean(String beanId){
		Object springBean = null;
		initApplicationContext();
		if (sSpringApplicationContext.containsBean(beanId)) {
			springBean = sSpringApplicationContext.getBean(beanId);
		}
		return springBean;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
