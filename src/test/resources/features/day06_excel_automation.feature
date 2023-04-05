@excel
Feature: excel_login_feature
  @smoke
  Scenario: TC01_customer_login
    Given kullanici "customer_info" bilgileri ile giris yapar
    And close the application
