@dummyFeatures
Feature: Add to cart 1
  mvn exec:java -Dexec.mainClass=io.cucumber.core.cli.Main

    Rule: Add from store

        Scenario Outline: Add one quantity to the cart 1
          Given I'm on the store page
          When I add a "<product_name>" to the Cart
          Then I see 1 "<product_name>" in the Cart
          Examples:
          | product_name |
          | Blue shoes   |