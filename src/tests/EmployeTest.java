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
		emp=new Employe();
		vd=mock(Validation.class);
		when (vd.validerId("employe.Employe","Em2016abcd")).thenReturn(true);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetId1() {
		/*assertTrue(emp.setId("Em2016abcd")=="Em2016abcd");*/
		assertEquals(emp.getId(),"Em2016abcd");
	}

}
