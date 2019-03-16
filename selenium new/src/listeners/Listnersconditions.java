package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listnersconditions extends TestListenerAdapter {
	public void OnTestFailure(ITestResult tr){
		System.out.println("your test is pass");}
	public void OnTestSuccess(ITestResult tr){
		System.out.println("your test is pass");
		
	}
	
	

}
