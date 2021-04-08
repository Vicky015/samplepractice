package org.testng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asrt {
	
	@Test
	private void tc1() {
		System.out.println("tc1");
	}
	
	@Test
	private void tc2() {
		System.out.println("tc2");
	//	Assert.assertTrue(false);
		SoftAssert s = new SoftAssert();
		s.assertTrue(true);
		s.assertAll();
		System.out.println("tc2");
		System.out.println("tc2");
		System.out.println("tc2");
		System.out.println("tc2");
	}

}
