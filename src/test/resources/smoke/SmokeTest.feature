Feature: AutoRegister Page Functionality

  Scenario: Verify User able to login with correct credentials
    Given User navigates to login page "https://ntkhr.noortecktraining.com/"
    When User enters username "ntk-admin"
    And User enters password "Ntk-orange!admin.123"
    And User clicks login button
    Then System redirects to dashboard page "Dashboard"

  Scenario: Verify User able to login with correct credentials FAIL
    Given User navigates to login page "https://ntkhr.noortecktraining.com/"
    When User enters username "ntk-admin"
    And User enters password "Ntk-orange!admin.123"
    And User clicks login button
    Then System redirects to dashboard page "Dashboard"
    Then System redirects to dashboard pages "Failed"

  Scenario: Verify User able to login with correct credentials FAIL
    Given User navigates to login page "https://ntkhr.noortecktraining.com/"
    When User enters username "ntk-admin"
    And User enters password "Ntk-orange!admin.123"
    And User clicks login button
    Then System redirects to dashboard page "Dashboard"
    Then System redirects to dashboard pages "Failed"

  Scenario: Verify User able to login with correct credentials FAIL
    Given User navigates to login page "https://ntkhr.noortecktraining.com/"
    When User enters username "ntk-admin"
    And User enters password "Ntk-orange!admin.123"
    And User clicks login button
    Then System redirects to dashboard page "Dashboard"
    Then System redirects to dashboard pages "Failed"

    
    