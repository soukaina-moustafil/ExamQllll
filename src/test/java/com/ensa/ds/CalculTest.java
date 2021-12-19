package com.ensa.ds;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculTest {

Calcul calcul;
	
	CalculService calculService = mock(CalculService.class);
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		calcul = new Calcul(calculService);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test 
	void testCalculNote()
	{
		assertEquals(2, calcul.calculNote(2, 2),"Moyen correct");
	}
	
	@Test 
	void testCompare ()
	{
		
		assertEquals(2.0, calcul.compare(3,3),"Moyen correct");
		
		if(calcul.compare(3, 0) !=1)
		{
			fail("non egaux");
		}
		
	}
	
	@Test 
	void testCalculSomme ()
	{
		when(calculService.method(0, 1)).thenReturn(3);
		when(calculService.method(2, 1)).thenReturn(1);
		
		assertEquals(2.0, calcul.calculNote(3,1),"Moyen correct");
		
	}

}
