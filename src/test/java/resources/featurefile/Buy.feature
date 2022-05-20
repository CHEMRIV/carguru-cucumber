Feature: Search functionality


  Scenario Outline: : Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the results
    Examples:
      | make       | model       | location            | price    |
      | Audi       | A4          | NSW - New England   | $70,000  |
      | BMW        | 120d        | NSW - Hunter        | $90,000  |
      | Ford       | Escort      | QLD - Central West  | $150,000 |
      | Holden     | Apollo      | SA - South East     | $200,000 |
      | Isuzu      | FTR         | SA - Barossa Valley | $80,000  |
      | Land Rover | Range Rover | VIC - South Western | $90,000  |


  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the results
    Examples:
      | make       | model       | location            | price    |
      | Audi       | A4          | NSW - New England   | $70,000  |
      | BMW        | 120d        | NSW - Hunter        | $90,000  |
      | Ford       | Escort      | QLD - Central West  | $70,000 |
      | Holden     | Apollo      | SA - South East     | $80,000 |
      | Isuzu      | FTR         | SA - Barossa Valley | $80,000  |
      | Land Rover | Range Rover | VIC - South Western | $90,000  |







