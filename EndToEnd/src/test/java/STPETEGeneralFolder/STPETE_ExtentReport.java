package STPETEGeneralFolder;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class STPETE_ExtentReport {
	static ExtentReports extent;
	public static ExtentReports getReporterObject()
	{
		String path = System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter .config().setReportName("Web Automation Testing");
		reporter.config().setDocumentTitle("Test Results");
		
	 extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Saranya");
	return extent;
	
	}
}
