Feature: As a user, I should be able to write comments to files/folders.
  @wip
  Scenario: Verify users to write comments to files/folder
    Given user on the dashboard pageS
    When the user clicks the "Files" moduleS
    And user click action-icon  from any file on the pageS
    And user choose the "Details" optionS
    And user write a comment inside the input boxS
    And user click the submit button to post itS
    When the user clicks the "Talk" moduleS
    Then Verify the comment is displayed in the comment sectionS.