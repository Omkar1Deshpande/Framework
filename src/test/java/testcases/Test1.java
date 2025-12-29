package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;

public class Test1 {
	@Test
	@Description("Testcase 1")
	public void Test1case() {
		Allure.step("Print String");
		System.out.println("Testcase 1");
		
		Allure.step("Validate String");
		//Assert.assertTrue(false);
	}
	@Test
	public void Testcase2() {
		System.out.println("Testcase 2");
	}
	
	@Test
	public void Testcase3() {
		System.out.println("Testcase 3");
	}
	
	@Test
	public void Testcase4() {
		System.out.println("Testcase 4");
	}
	
	@Test
	public void Testcase5() {
		System.out.println("Testcase 5");
	}
	

}
