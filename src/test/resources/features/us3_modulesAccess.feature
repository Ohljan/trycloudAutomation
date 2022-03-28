Feature: As a user, I should be accessing all the main modules of the app
@us3
  Scenario: Verify users accessing all the main modules of the app
    Given user is on the login page
    When the users log in with the valid credentials
    Then verify the users see the following modules
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Mail      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |
