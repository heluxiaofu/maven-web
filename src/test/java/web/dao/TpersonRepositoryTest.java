package web.dao;

import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import web.po.Tperson;
import web.util.SpringBeanContainer;

public class TpersonRepositoryTest {
	
	private TpersonRepository mTpersonRepository;
	
	@Before
	public void setUp() throws Exception {
		mTpersonRepository = (TpersonRepository) SpringBeanContainer.getSpringBean("tpersonRepository");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Iterator<Tperson> ite = mTpersonRepository.findAll().iterator();
				
		while(ite.hasNext()){
			System.out.println(ite.next().getTpersonId());
		}
	}

}
