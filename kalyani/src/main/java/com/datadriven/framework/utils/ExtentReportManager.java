package com.datadriven.framework.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;

public class ExtentReportManager {

	public static void main(String[] args, Object reports) {
		// TODO Auto-generated method stub
ExtentHtmlReporter HtmlReporter;
ExtentReports report;
public static report getReportInstance() {
	ExtentReports report;
	Object HtmlReporter;
	if(HtmlReporter==null && report==null)
	{
		HtmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test.out/testreport.html");
	report1 = new ExtentReports();
		
report1.setSystemInfo("OS","windpws 10");
report1.setSystemInfo("Environment","UAI");
		report.setSystemInfo("Build Number","10.8.1");
		report.setSystemInfo("Browser","Chrome");
		((Object) HtmlReporter).Config().setDocumentTitle("UAI UT Automation results");
		((Object) HtmlReporter).Config().setReportName("All Headlines UI test Report");
		Object ChartLocation;
		((Object) HtmlReporter).Config().setTestViewChartLocation(ChartLocation,"top");
		((Object) HtmlReporter).Config().setTimeStampFormat("MM,ddd,yyyy HH:mm:ss");
}
	}
		
	}

	public static ExtentReports getReportInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
