package TestNG;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerdemo implements ITestListener {


    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("login failed");
        try {
			login_fail_listener.screenshort();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }


	

}
