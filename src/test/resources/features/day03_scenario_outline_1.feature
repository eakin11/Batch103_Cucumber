@scenario_outline_1
Feature: arama_feature

  Background: Google_sayfasina_git
    Given kullanici Google'a gider

  Scenario Outline: "<product>"_arama_testi

    When kullanici "<product>" kelimesini aratir
    Then sonucun "<product>" içerdiğini dogrular
    Then close the application

    Examples: data
      | product |
      | iPhone  |
      | tesla   |
      | dog     |

