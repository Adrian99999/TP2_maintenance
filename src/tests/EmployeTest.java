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
		vd=new Validation();
		emp=mock(Employe.class);
		when(emp.getNomClasse()).thenReturn("em2016abcd");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(true,vd.validerId(emp.getClass().getName(),emp.getId()));
	}

}
