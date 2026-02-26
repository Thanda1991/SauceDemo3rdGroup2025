package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

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
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentSparkReporter.config().setEncoding("utf-8");
        extentSparkReporter.config().setTimeStampFormat("dd-MM-yyyy HH:mm:ss");

        extentReports.setSystemInfo("OS",System.getProperty("os.name"));
        extentReports.setSystemInfo("Exection Machine",System.getProperty("user.name"));
        extentReports.setSystemInfo("Project", "SauceDemo Automation");
        extentReports.setSystemInfo("Tester", "Lubabalo Mkhize");
        extentReports.setSystemInfo("Browser", "Chrome");
        extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
        return extentReports;
    }
}
