package TestNG_prac;

import org.testng.annotations.Test;

public class TestNGGrouping {

	@Test(groups = "Realme")
	public static void realme1() {
		System.out.println("realme1");
	}
	@Test(groups = "Realme")
	public static void realme2() {
		System.out.println("realme2");
	}
	
	@Test(groups = "OnePlus")
	public static void oneplus1() {
		System.out.println("oneplus1");
	}
	@Test(groups = "OnePlus")
	public static void oneplus2() {
		System.out.println("oneplus2");
	}
}
