package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)




@CucumberOptions (
					features = "src/test/resources/smoke/SmokeTest.feature",
					glue = "com.steps",
					plugin = {"pretty",
					"json:target/cucumber.json",
					"html:target/cucumber.html"}
				)

public class Runner {

}


/**
	in this Runner class we are providing specific feature file to execute


*/