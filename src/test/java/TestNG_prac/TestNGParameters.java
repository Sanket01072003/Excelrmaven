package TestNG_prac;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	
	@Test()
	@Parameters("username")
	public static void parameter(String username) {
		// TODO Auto-generated method stub
		System.out.println(username);
	}

}
