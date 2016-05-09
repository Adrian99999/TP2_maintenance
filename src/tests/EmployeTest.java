package tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import employe.Employe;
import utils.Validation;

public class EmployeTest {
	
	Employe emp1;
	Employe emp2;
	Validation vd;
	
	@Before
	public void setUp() throws Exception {
		emp1 = new Employe();
		emp2 = new Employe();
		vd = mock(Validation.class);
		when(vd.validerId("employe.Employe","Em2016abc1")).thenReturn(true);
		when(vd.validerId("employe.Employe","e201abc")).thenReturn(false);		
		when(vd.validerMtp("A#bc123de")).thenReturn(true);
		when(vd.validerMtp("a#bc123")).thenReturn(false);
		emp1.setId("Em2016abc1");
		emp2.setId("e201abc");
		emp1.setMtp("A#bc123de");
		emp2.setMtp("a#bc123");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetId1() {
		assertEquals("Em2016abc1", emp1.getId());
	}
	
	@Test
	public void testSetId2() {
		assertEquals(null, emp2.getId());
	}
	
	@Test
	public void testSetMtp1() {
		assertEquals("A#bc123de", emp1.getMtp());
	}
	
	@Test
	public void testSetMtp2() {
		assertEquals(null, emp2.getMtp());
	}
	
}
