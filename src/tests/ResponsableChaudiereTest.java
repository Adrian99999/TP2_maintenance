package tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import employe.ResponsableChaudiere;
import utils.Validation;

public class ResponsableChaudiereTest {
	ResponsableChaudiere rc1;
	ResponsableChaudiere rc2;

	Validation vd;

	@Before
	public void setUp() throws Exception {
		rc1 = new ResponsableChaudiere();
		rc2 = new ResponsableChaudiere();

		vd = mock(Validation.class);
		when(vd.validerId("employe.ResponsableChaudiere", "Re2016aa11")).thenReturn(true);
		when(vd.validerId("employe.ResponsableChaudiere", "Re2015aa")).thenReturn(false);

		rc1.setId("Re2016aa11");

		rc2.setId("Re2015aa");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetId1() {
		assertEquals("Re2016aa11", rc1.getIdResponsableChaudiere());
	}

	@Test
	public void testSetId2() {
		assertEquals(null, rc2.getIdResponsableChaudiere());
	}

}
