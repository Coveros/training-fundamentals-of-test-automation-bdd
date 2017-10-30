package com.coveros.training.automation.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags={"@qatests"}, plugin = { "html:target/cucumber-html-report, pretty" }, features = { "src/test/resources/cucumber/features" })
public final class LibraryTest {

}
