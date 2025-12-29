package testcases;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;

public class Test1 {
	
	private static final Logger log = LogManager.getLogger(Test1.class);
	@Test
	@Description("Testcase 1")
	public void Test1case() {
		Allure.step("Print String");
		System.out.println("Testcase 1");
		log.info("Test 1");
		Allure.step("Validate String");
		//Assert.assertTrue(false);
	}
	@Test
	public void Testcase2() {
		log.debug("This is debug");
		System.out.println("Testcase 2");
	}
	
	@Test
	public void Testcase3() {
		 log.warn("This is a warning");
		System.out.println("Testcase 3");
	}
	
	@Test
	public void Testcase4() {
		log.error("This is an error");
		System.out.println("Testcase 4");
	}
	
	@Test
	public void Testcase5() {
		System.out.println("Testcase 5");
	}
	

}
