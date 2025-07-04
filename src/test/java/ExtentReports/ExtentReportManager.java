package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class ExtentReportManager {

    private static String reportDir=System.getProperty("user.dir")+"/Reports/sauceDemo.html";

    private static ExtentReports extentReports;
    private static ExtentSparkReporter extentSparkReporter;

    public static ExtentReports extentSetup(){

        extentReports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(new File(reportDir));
        extentReports.attachReporter(extentSparkReporter);

        extentSparkReporter.config().setDocumentTitle("Extent Report");
        extentSparkReporter.config().setReportName("Sauce Demo");

        extentReports.setSystemInfo("OS",System.getProperty("os.name"));
        extentReports.setSystemInfo("Exection Machine",System.getProperty("user.name"));
        return extentReports;
    }
}
