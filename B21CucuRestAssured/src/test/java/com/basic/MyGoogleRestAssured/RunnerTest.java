package com.basic.MyGoogleRestAssured;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={"src/test/resources/com/basic/MyGoogleRestAssured/"},
		//the above path consider all the feature file in the package
		//to add multiple feature file we can add in above {1 File path},{2 File path}
		
		glue	={"com/basic/MyGoogleRestAssured/"},
		//glue is for java files
		monochrome=true
		//above line for proper console output
		
		)
public class RunnerTest {

}
