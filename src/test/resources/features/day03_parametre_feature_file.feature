@parametre
Feature: arama_feature

  Background: Google_sayfasina_git
    Given kullanici Google'a gider

  Scenario: TC01_google_iphone_arama
    When kullanici "iphone" kelimesini aratir
    Then sonucun "iphone" içerdiğini dogrular
    Then close the application

  Scenario: TC01_google_teapot_arama
    When kullanici "teapot" kelimesini aratir
    Then sonucun "teapot" içerdiğini dogrular
    Then close the application

  Scenario: TC01_google_tesla_arama
    When kullanici "tesla" kelimesini aratir
    Then sonucun "tesla" içerdiğini dogrular
    Then close the application
