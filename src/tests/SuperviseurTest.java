package tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import employe.Superviseur;
import utils.Validation;

public class SuperviseurTest {
	Superviseur su1;
	Superviseur su2;

	Validation vd;

	@Before
	public void setUp() throws Exception {
		su1 = new Superviseur();
		su2 = new Superviseur();

		vd = mock(Validation.class);
		when(vd.validerId("employe.Superviseur", "Su2016aa11")).thenReturn(true);
		when(vd.validerId("employe.Superviseur", "Su2015aa")).thenReturn(false);

		su1.setId("Su2016aa11");

		su1.setId("Su2015aa");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetId1() {
		assertEquals("Su2016aa11", su1.getIdSuperviseur());
	}

	@Test
	public void testSetId2() {
		assertEquals(null, su2.getIdSuperviseur());
	}
}
