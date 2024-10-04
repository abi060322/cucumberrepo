package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue = "org.StepDefinition",plugin = {"html:target","junit:juniF\\junit.xml","json:jsonF\\jsonfile.json"})
public class Runnerclass {
	
	@AfterClass
	public static void afterclstc() {
		JvmReport.generateJvmReport("C:\\Users\\ABIMANI\\eclipse-workspace\\CucumberAdactinMiniProject\\jsonF\\jsonfile.json");
	}

}
