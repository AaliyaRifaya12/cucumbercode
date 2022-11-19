@Login
Feature: Verifying of Adactin Hotel login page details

  Scenario Outline: Verifying Adactin Hotel login using valid data
    Given User is on  the adactin hotel login page
    When User should perform  login "<userName>","<password>"
    Then User should verify after login success message "HelloHello AaliyaRifaya!"

    Examples: 
      | userName     | password   |
      | AaliyaRifaya | Aaliya@123 |

  Scenario Outline: Verifying Adactin Hotel login using valid data with Enter key
    Given User is on  the adactin hotel login page
    When User should perform  login "<userName>","<password>" with Enter key
    Then User should verify after login success message "HelloHello AaliyaRifaya!"

    Examples: 
      | userName     | password   |
      | AaliyaRifaya | Aaliya@123 |

  Scenario Outline: Verifying Adactin Hotel login using Invalid credentials
    Given User is on  the adactin hotel login page
    When User should perform  login "<userName>","<password>"
    Then User should verify after login with invalid credential error message contains "Invalid Login details or Your Password might have expired"

    Examples: 
      | userName     | password   |
      | AaliyaRifaya | Aaliya@123 |
