package tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import employe.Employe;
import utils.Validation;

public class ValidationTest {
	
	Employe emp;
	Validation vd;

	@Before
	public void setUp() throws Exception {
		vd=new Validation();
		emp=mock(Employe.class);
		when(emp.getNomClasse()).thenReturn("employe.Employe");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testValiderIdJeux1() {
		assertEquals((vd.validerId(emp.getNomClasse(),"Em2016abcd")),true);
	}
	
	@Test
	public void testValiderIdJeux2() {
		assertEquals((vd.validerId(emp.getNomClasse(),"")),false);
	}
	
	@Test
	public void testValiderIdJeux3() {
		assertEquals((vd.validerId(emp.getNomClasse(),"Em2016abcdef")),false);
	}
	
	@Test
	public void testValiderIdJeux4() {
		assertEquals((vd.validerId(emp.getNomClasse(),"Em2016ab")),false);
	}
	
	@Test
	public void testValiderIdJeux5() {
		assertEquals((vd.validerId(emp.getNomClasse(),"Em2016")),false);
	}
	
	
	@Test
	public void testValiderIdJeux6() {
		assertEquals((vd.validerId(emp.getNomClasse(),"Emaaffabcd")),false);
	}
	
	@Test
	public void testValiderIdJeux7() {
		assertEquals((vd.validerId(emp.getNomClasse(),"Em2015abcd")),false);
	}
	
	@Test
	public void testValiderIdJeux8() {
		assertEquals((vd.validerId(emp.getNomClasse(),"bb2016abcd")),false);
	}
	
	@Test
	public void testValiderIdJeux9() {
		assertEquals((vd.validerId(emp.getNomClasse(),"2016aaabcd")),false);
	}
	
	@Test
	public void testValiderIdJeux10() {
		assertEquals((vd.validerId(emp.getNomClasse(),"em2016@bcd")),false);
	}
	
	@Test
	public void testValiderIdJeux11() {
		assertEquals((vd.validerId(emp.getNomClasse(),"     ")),false);
	}
	
	
	@Test
	public void testValiderMtpJeux1() {
		assertEquals(vd.validerMtp("Rhd34Mf&"),true);
	}
	
	@Test
	public void testValiderMtpJeux2() {
		assertEquals(vd.validerMtp("Feat5&"),false);
	}
	
	@Test
	public void testValiderMtpJeux3() {
		assertEquals(vd.validerMtp("    "),false);
	}
	
	@Test
	public void testValiderMtpJeux4() {
		assertEquals(vd.validerMtp(""),false);
	}
	
	@Test
	public void testValiderMtpJeux5() {
		assertEquals(vd.validerMtp("G56fhydY$k"),true);
	}
	
	@Test
	public void testValiderMtpJeux6() {
		assertEquals(vd.validerMtp("Tvjf36hf%&fhdd&P"),false);
	}
	
	@Test
	public void testValiderMtpJeux7() {
		assertEquals(vd.validerMtp("N45dg%hdW!fB$_R"),true);
	}
	
	@Test
	public void testValiderMtpJeux8() {
		assertEquals(vd.validerMtp("N3xUMAV!"),false);
	}
	
	@Test
	public void testValiderMtpJeux9() {
		assertEquals(vd.validerMtp("N3xU58A!"),true);
	}
	
	@Test
	public void testValiderMtpJeux10() {
		assertEquals(vd.validerMtp("NHxUMAV!"),false);
	}
	
	@Test
	public void testValiderMtpJeux11() {
		assertEquals(vd.validerMtp("Ad8Gs9c#"),true);
	}
	
	@Test
	public void testValiderMtpJeux12() {
		assertEquals(vd.validerMtp("464432?&"),false);
	}
	
	@Test
	public void testValiderMtpJeux13() {
		assertEquals(vd.validerMtp("G45?762?"),false);
	}
	
	@Test
	public void testValiderMtpJeux14() {
		assertEquals(vd.validerMtp("K7j76(57"),true);
	}
	
	@Test
	public void testValiderMtpJeux15() {
		assertEquals(vd.validerMtp("T76&hde!"),true);
	}
	
	@Test
	public void testValiderMtpJeux16() {
		assertEquals(vd.validerMtp("fT56&rt*"),false);
	}
	
	@Test
	public void testValiderMtpJeux17() {
		assertEquals(vd.validerMtp("B8%893f!"),true);
	}
	
	@Test
	public void testValiderMtpJeux18() {
		assertEquals(vd.validerMtp("4thD%7$k"),false);
	}
	
	@Test
	public void testValiderMtpJeux19() {
		assertEquals(vd.validerMtp("%56hfd7&"),false);
	}
	
	@Test
	public void testValiderMtpJeux20() {
		assertEquals(vd.validerMtp("T45n7TyH"),false);
	}
	
	@Test
	public void testValiderMtpJeux21() {
		assertEquals(vd.validerMtp("R45&hd3n"),true);
	}
	
	@Test
	public void testValiderMtpJeux22() {
		assertEquals(vd.validerMtp("T56&gh#hg*h6?j"),true);
	}
	
}
