package TestNG_prac;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListmer implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Login Failed..!");
		login_failure.screenshot();
	}
}
