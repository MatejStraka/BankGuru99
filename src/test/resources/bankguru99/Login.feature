Feature: As a manager I want to be able to login

  Scenario: Manager login to Guru99 bank
    Given Manager is on the Guru login page
    When Manager enter id "mngr360280" and password "esEvuta"
    Then Manager can see dashboard with his id "mngr360280"