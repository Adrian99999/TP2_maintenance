package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import messagerie.ServiceMessagerie;

public class ServiceMessagerieTest {
	
	ServiceMessagerie sm;

	@Before
	public void setUp() throws Exception {
		sm=new ServiceMessagerie();
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testMsgFormatMessage1() {
		String chaine="Thg!57Ef Se2016abcd Ca2016abcd";
		String [] converti=chaine.split(" ");
		assertEquals(sm.formatMsgValide(converti),false);
	}
	
	@Test
	public void testMsgFormatMessage2() {
		String chaine="Re2016abcf Thg!57Ef Se2016abcd Ca2016abcd";
		String [] converti=chaine.split(" ");
		assertEquals(sm.formatMsgValide(converti),true);
	}
	
	@Test
	public void testMsgFormatMessage3() {
		String chaine="Re2016abcf Thg!57Ef  Se2016abcd Ca2016abcd abcd";
		String [] converti=chaine.split(" ");
		assertEquals(sm.formatMsgValide(converti),false);
	}
	
	@Test
	public void testMsgFormatMessage4() {
		String chaine="Re2016abcf Thg!57Ef  Se2016abcd   Ca2016abcd";
		String [] converti=chaine.split(" ");
		assertEquals(sm.formatMsgValide(converti),false);
	}
	
	@Test
	public void testMsgFormatMessage5() {
		String chaine="Su2016agtf R45*rghF Se2016abst";
		String [] converti=chaine.split(" ");
		assertEquals(sm.formatMsgValide(converti),false);
	}
	
	@Test
	public void testMsgFormatMessage6() {
		String chaine="Su2016agtf R45*rghF Se2016abst So2016djgn";
		String [] converti=chaine.split(" ");
		assertEquals(sm.formatMsgValide(converti),true);
	}
	
	@Test
	public void testMsgFormatMessage7() {
		String chaine="Su2016agtf R45*rghF Se2016abst So2016djgn poisson";
		String [] converti=chaine.split(" ");
		assertEquals(sm.formatMsgValide(converti),false);
	}
	
	@Test
	public void testMsgFormatMessage8() {
		String chaine="Su2016agtf R45*rghF  Se2016abst   So2016djgn";
		String [] converti=chaine.split(" ");
		assertEquals(sm.formatMsgValide(converti),false);
	}
	
	@Test
	public void testMsgFormatMessage9() {
		String chaine="T56&rfhd 4184769564 je serais en retard ce soir";
		String [] converti=chaine.split(" ");
		assertEquals(sm.formatMsgValide(converti),false);
	}
	
	@Test
	public void testMsgFormatMessage10() {
		String chaine="Em2016hskg T56&rfhd 4184769564 je serais e n retard ce soir";
		String [] converti=chaine.split(" ");
		assertEquals(sm.formatMsgValide(converti),true);
	}
	
	@Test
	public void testMsgFormatMessage11() {
		String chaine="Em2016hskg T56&rfhd bonjour je serai en retard ce soir";
		String [] converti=chaine.split(" ");
		assertEquals(sm.formatMsgValide(converti),false);
	}
	
	@Test
	public void testMsgFormatMessage12() {
		String chaine="Em2016hskg T56&rfhd  4184769564   je serais e n retard ce soir";
		String [] converti=chaine.split(" ");
		assertEquals(sm.formatMsgValide(converti),false);
	}
	
}
