package com.github.kevbradwick.cukesquickstart.steps;

import com.github.kevbradwick.cukesquickstart.TestHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import javax.inject.Inject;

public class AllSteps {

    private final TestHelper helper;

    @Inject
    AllSteps(TestHelper helper) {
        this.helper = helper;
    }

    @Given("^I read the blog post \"([^\"]*)\"$")
    public void i_read_the_blog_post(String title) {
        helper.print(title);
    }

    @Given("^I create a new Cucumber project$")
    public void i_create_a_new_Cucumber_project() {
    }

    @Given("^I run my tests with \"([^\"]*)\"$")
    public void i_run_my_tests_with(String command) {
    }

    @Then("^my tests should run$")
    public void my_tests_should_run() {
    }
}
