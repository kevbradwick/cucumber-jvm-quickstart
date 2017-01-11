Feature: Example

  Scenario: Getting up and running with Cucumber JVM
    Given I read the blog post "Getting started with Cucumber JVM"
    And I create a new Cucumber project
    And I run my tests with "mvn clean test"
    Then my tests should run
