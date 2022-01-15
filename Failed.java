package week5.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer {
	int count=0;

	public boolean retry(ITestResult result) {
		if(count<2) {
			count++;
			
			return true;
			
		}
		else
		return false;
	}


}
