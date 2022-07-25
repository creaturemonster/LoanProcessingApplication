Feature: Process a Loan with a Scenario Outline

User Story: Process a Loan
As a loan officer, I want to approve loan applications that have a good credit score 
and a stable employment history, and reject those that don't.

Business Rules:
A good credit score is defined as 720 or above
Stable employment is defined as 1 or more years of continuous employment

  Scenario Outline: 
    Given the user has successfully logged on
    When they have a credit score of <credit score>
    And they have <employed> years of continuous employment
    Then their loan status is <status>

	Scenario Outline:
		Given the user has successfully logged on
		When they have a credit score of <credit score>
		But they have <employed> years of continuous employment
		Then their loan status is <status>
		
    Examples: 
      | credit score | employed | status     |
      |          720 |      1.1 | "Approved" |
      |          721 |      0.9 | "Rejected" |

      