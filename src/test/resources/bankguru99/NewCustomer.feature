Feature: As a manager I want to be able to create new customer account

  Scenario: New customer account
    Given Manager is logged in on the Guru99 bank
    When Manager opens new customer form
    And Enter customer name "customer"
    And Enter customer gender "male"
    And Enter customer date of birth "01011990"
    And Enter customer address "street"
    And Enter customer city "Prague"
    And Enter customer state "Czechia"
    And Enter customer pin "123456"
    And Enter customer mobile number "789123456"
    And Enter customer email
    And Enter customer password "Test1234"
    And Click on submit button
    Then Message "Customer Registered Successfully!!!" is displayed

