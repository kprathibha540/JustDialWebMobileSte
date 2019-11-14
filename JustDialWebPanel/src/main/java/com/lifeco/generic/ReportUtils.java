package com.lifeco.generic;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.lifeco.generic.BaseTest;

public class ReportUtils extends BaseTest{
	public void createextentreport(String classname,String methodName) {
		String path=""+classname+".html";
		reporter = new ExtentHtmlReporter(path);
		extent.attachReporter(reporter);
		ExtentTest extentTest = extent.createTest(methodName);
	}


}
