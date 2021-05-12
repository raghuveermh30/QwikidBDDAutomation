package com.qa.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Raghuveer.MH\\eclipse-workspace\\QwikIDAutomation\\src\\main\\java\\com\\qa\\features\\Login.Feature",//path of the feature file
				glue={"com\\qa\\stepdef"}, //the path of the step definition files -- means package name
				format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
						monochrome = true, //display the console output in a proper readable format
				strict = true, //it will check if any step is not defined in step definition file and it will execute the case and it will fail where that step is missed
				dryRun = false //to check the mapping is proper between feature file and step def file
			//	tags = {"@SmokeTest" , "@Regression", "@End2End"}
		//tags = {"@SmokeTest, @Regression"}
	
		//@SmokeTest @Regression @End2End 
		)


public class TestRunner {
	
	//OR :tags = {"@SmokeTest, @Regression"} -- Execute all the tests tagged as @SmokeTest OR Regression
	//AND : 	tags = {"@SmokeTest", "@Regression"} -- Execute all the tests tagged as @SmokeTest AND Regression
	//IGNORE : tags = {"~@SmokeTest, ~@Regression"} -- Execute all the test cases which are not Tagged as @SmokeTest and @Regression
	
}
	