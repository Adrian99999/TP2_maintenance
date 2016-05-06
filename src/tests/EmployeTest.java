package tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import employe.Employe;
import utils.Validation;

public class EmployeTest {
	
	Employe emp;
	Validation vd;
	
	@Before
	public void setUp() throws Exception {
		emp = new Employe();
		vd = mock(Validation.class);
		when(vd.validerId("employe.Employe","Em2016abc")).thenReturn(false);
		emp.setId("Em2016abc");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetId1() {
		assertEquals(null, emp.getId());
	}

}
