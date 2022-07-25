Feature: Process a Loan

User Story: Process a Loan
As a loan officer, I want to approve loan applications that have a good credit score 
and a stable employment history, and reject those that don't.

Business Rules:
A good credit score is defined as 720 or above
Stable employment is defined as 1 or more years of continuous employment

  Scenario: Approved with good credit and employment
    Given the user has successfully logged on
    When they have a credit score of 721
    And they have 1.1 years of continuous employment
    Then their loan status is "Approved"

  Scenario: Rejected with good credit but insufficient employment
    Given the user has successfully logged on
    When they have a credit score of 721
    But they have 0.9 years of continuous employment
    Then their loan status is "Rejected"

	Scenario: Rejected with bad credit and employment
		Given the user has successfully logged on
		When they have a credit score of 580
		And they have 0.9 years of continuous employment
		Then their loan status is "Rejected"
		
	Scenario: Rejected with bad credit, but good employment
		Given the user has successfully logged on
		When they have a credit score of 580
		But they have 1.1 years of continuous employment
		Then their loan status is "Rejected"
