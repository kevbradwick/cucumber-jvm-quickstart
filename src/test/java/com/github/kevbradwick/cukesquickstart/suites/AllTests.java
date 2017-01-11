package com.github.kevbradwick.cukesquickstart.suites;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.github.kevbradwick.cukesquickstart"},
        plugin = {"pretty", "html:target/cucumber"},
        features = "."
)
public class AllTests {
}
