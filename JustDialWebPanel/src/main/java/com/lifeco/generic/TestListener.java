package com.lifeco.generic;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import extentReports.ExtentManager;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    protected static final ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    //Extent Report Declarations
    private static final ExtentReports extent = ExtentManager.getInstance();

    @Override
    public synchronized void onStart(ITestContext context) {
    }

    @Override
    public synchronized void onFinish(ITestContext context) {
        extent.flush();
    }

    @Override
    public synchronized void onTestStart(ITestResult result) {
        ExtentTest extentTest;
        if (result.getMethod().getDescription() == null)
            extentTest = extent.createTest(result.getMethod().getMethodName());
        else
            extentTest = extent.createTest(result.getMethod().getDescription(), "Test Method: " + result.getMethod().getMethodName());
        test.set(extentTest);
        test.get().assignCategory(result.getInstanceName());
    }

    @Override
    public synchronized void onTestSuccess(ITestResult result) {
        test.get().pass("Test passed");
    }

    @Override
    public synchronized void onTestFailure(ITestResult result) {

        test.get().fail(result.getThrowable());
    }

    @Override
    public synchronized void onTestSkipped(ITestResult result) {
        test.get().skip(result.getThrowable());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }
}
