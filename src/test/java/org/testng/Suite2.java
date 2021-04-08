package org.testng;

import org.testng.annotations.Test;

public class Suite2 {
	
	@Test(dataProvider ="sample",dataProviderClass = Suite1.class)
	private void tc11(String email,String pass) {
		System.out.println(email);
		System.out.println(pass);
		System.out.println("success");
		
	}
	
}
