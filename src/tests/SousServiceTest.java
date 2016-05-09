package tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import employe.SousService;
import utils.Validation;

public class SousServiceTest {

	SousService ss1;
	SousService ss2;

	Validation vd;

	@Before
	public void setUp() throws Exception {
		ss1 = new SousService();
		ss2 = new SousService();
		when(vd.validerId("employe.SousService", "So2016aa11")).thenReturn(true);
		when(vd.validerId("employe.SousService", "Ss2015aa")).thenReturn(false);
		ss1.setIdSousService("So2016aa11");
		ss2.setIdSousService("Ss2015aa");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetIdSousService1() {
		assertEquals("So2016aa11", ss1.getIdSousService());
	}

	@Test
	public void testSetIdSousService2() {
		assertEquals(null, ss2.getIdSousService());
	}

}
