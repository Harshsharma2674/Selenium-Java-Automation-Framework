package com.automation.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentmanager {
    private static ExtentReports extent;

    public static ExtentReports getInstance(){
        if(extent ==null){
            ExtentSparkReporter spark=new ExtentSparkReporter("reports/ExtentReportr.HTML");
            spark.config().setReportName("Automation Test results");
            spark.config().setDocumentTitle("Test Report");

            extent= new ExtentReports();
            extent.attachReporter(spark);
        }
        return extent;
    }
}
