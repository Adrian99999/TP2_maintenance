package tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import employe.Service;
import utils.Validation;

public class ServiceTest {

	Service ser1;
	Service ser2;

	Validation vd;

	@Before
	public void setUp() throws Exception {
		ser1 = new Service();
		ser2 = new Service();
		vd = mock(Validation.class);
		when(vd.validerId("employe.Service", "Se2016aa11")).thenReturn(true);
		when(vd.validerId("employe.Service", "Se2015aa")).thenReturn(false);

		ser1.setIdService("Se2016aa11");
		ser2.setIdService("Se2015aa");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetIdService1() {
		assertEquals("Se2016aa11", ser1.getIdService());
	}

	@Test
	public void testSetIdService2() {
		assertEquals(null, ser2.getIdService());
	}

}
