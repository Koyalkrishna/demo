package pratice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyserDemo {
	@Test(retryAnalyzer = com.crm.autodesk.genericutility.RetryAnalyser.class)
	public void RetryAnalyserDemoTest()
	{
		System.out.println("RetryAnalyser");
		Assert.fail();
	}
	

}
