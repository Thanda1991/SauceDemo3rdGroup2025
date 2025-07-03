package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

    private static ExtentReports extent;
    private static ExtentTest extentTest;

    public void onTestStart(ITestResult result) {
        extentTest = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.log(Status.FAIL, "Test Case " + result.getMethod().getMethodName() + "Has failed");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.log(Status.PASS, "Test Case " + result.getMethod().getMethodName() + "Has passed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTest.log(Status.SKIP, "Test Case " + result.getMethod().getMethodName() + "Has skipped");
    }

    @Override
    public void onFinish(ITestContext result) {
        extent.flush();
    }

    public void onStart(ITestContext context) {
        extent = ExtentReportManager.extentSetup();
    }

}
