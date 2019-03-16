package logsSucussFailurSkeep;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
//import org.testng.annotations.Test;

public class locks extends TestListenerAdapter {
	@Override
	public void onTestFailure(ITestResult tr) {
	  log(tr.getName()+"test method faild\n");
  }
	@Override
  public void onTestSuccess(ITestResult tr) {
	  log(tr.getName()+"test method success\n");
  }
	
	private void log(String String){
		System.out.println("string");
	}
}
