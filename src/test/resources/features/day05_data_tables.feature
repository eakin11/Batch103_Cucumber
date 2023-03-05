@data_table
Feature: data_table_feature

  @testrunner
  Scenario: TC01_login
    Given kullanici "https://www.bluerentalcars.com/login" gider
    When kullanici email ve sifre girer
      | email                         | sifre     |
      | sam.walker@bluerentalcars.com | c!fas_art |
    And kullanici mavi login butonuna tiklar
    And close the application
