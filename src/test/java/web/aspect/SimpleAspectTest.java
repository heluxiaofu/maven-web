package web.aspect;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

import web.util.SpringBeanContainer;

public class SimpleAspectTest {
	
	private SimpleAspect mSimpleAspect;

	@Before
	public void setUp() throws Exception {
		mSimpleAspect = (SimpleAspect) SpringBeanContainer.getSpringBean("simpleAspect");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		mSimpleAspect.simpleAspect();
		mSimpleAspect.fun(1);
		
		/*SimpleAspect simpleAspect = new SimpleAspect();
		simpleAspect.simpleAspect();
		
		AspectJProxyFactory aopFactory = new AspectJProxyFactory();
		aopFactory.setTarget(simpleAspect);
		aopFactory.addAspect(PreAspect.class);
		SimpleAspect tSimpleAspect = aopFactory.getProxy();
		tSimpleAspect.simpleAspect();*/
	}

}
