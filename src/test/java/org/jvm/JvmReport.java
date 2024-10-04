package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class JvmReport {

	public static void generateJvmReport(String jsonpath) {
		
    File f=new File("C:\\Users\\ABIMANI\\eclipse-workspace\\CucumberAdactinMiniProject\\JvmReport");
    
    Configuration c=new Configuration(f, "CucumberAdactinMiniProject");
    c.addClassifications("platform name", "windows");
    c.addClassifications("platform version", "windows10");
    c.addClassifications("browser name", "chrome");
    c.addClassifications("browser version", "129.0985");
    
    List<String> li= new ArrayList<String>();
    li.add(jsonpath);
    
    ReportBuilder r=new ReportBuilder(li, c);
    r.generateReports();
    		


	}
	
	
	
}
