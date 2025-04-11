package TestNG_prac;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class retryanlyser implements IRetryAnalyzer {
	int failedcount = 0 ;
	int limit = 4;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(failedcount < limit) {
			return true;
		}
		return false;
	}
	
}
