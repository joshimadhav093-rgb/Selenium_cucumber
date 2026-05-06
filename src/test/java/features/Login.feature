Feature: Check Login fucntionality

  Scenario Outline:  Check Loging fucntionality is working for Valid credential
    Given browser is open
    And User on login page
    When User enter <username> and <password>
    And Click on login button
    Then User navigate to home page

    Examples:
      | username | password     |
      | standard_user | secret_sauce |


  Scenario Outline: Check user is able to login with invalid credentials
    Given browser is open
    And User on login page
    When User enter <username> and <password>
    And Click on login button
    Then User navigate to home page

    Examples:
    | username | password |
    |standard_user| abcd1234  |

    Scenario Outline: check is user is able to login with different credentials
      Given browser is open
      And User on login page
      When User enter <username> and <password>
      And Click on login button
      Then User navigate to home page
      Examples:
        | username | password |
        |locked_out_user| secret_sauce  |
        |problem_user| secret_sauce  |
        |problem_user| secret_sauce  |
        |error_user| secret_sauce  |
        |visual_user| secret_sauce  |




