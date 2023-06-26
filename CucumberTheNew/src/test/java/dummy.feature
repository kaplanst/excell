# What is the Feature?
@dummyFeatures
Feature: Add to cart

  As a customer of XYZ app
  I want to add a product to the cart
  So that I can purchase the product

  Scenario Outline: Dummy scenario
    Given my account balance is $<balance>
    When I withdraw $<withdraw>
    Then my balance should be $<result>

    Examples:
    | balance | withdraw | result   |
    | 100     | 50       | 50       |
    | 50      | 50       | 0        |
    | 150     | 50       | 100      |


  Scenario: Next scenario
    Given I want to by some "Blue shoes"
    When I clicked "Blue shoes" icon 10 times
    Then 10 "Blue shoes" are in the cart
