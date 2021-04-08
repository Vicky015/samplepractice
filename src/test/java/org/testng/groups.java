package org.testng;

import org.testng.annotations.Test;

public class groups
{
	
	@Test(groups = "smoke")
	private void tc111() {
		System.out.println("tc111");
	}
	@Test(groups = "sanity")
	private void tc222() {
		System.out.println("tc222");
		
	}
	@Test(groups = "regression")
	private void tc333() {
		System.out.println("tc333");
	}
	
	@Test(groups = "retesting")
	private void tc444() {
		System.out.println("tc444");
	}
	
	@Test(groups = "rerun")
	private void tc555() {
		System.out.println("tc555");
	}
	
	@Test(groups = "smoke")
	private void tc666() {
		System.out.println("tc666");
	}
	
	@Test(groups = "sanity")
	private void tc777() {
		System.out.println("tc777");
	}
	
	@Test(groups = "regression")
	private void tc888() {
		System.out.println("tc888");
	}
	
}
