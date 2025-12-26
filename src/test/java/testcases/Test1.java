package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void Test1case() {
		System.out.println("Testcase 1");
		Assert.assertEquals("String", "NoString", "Titles of the website do not match");
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
