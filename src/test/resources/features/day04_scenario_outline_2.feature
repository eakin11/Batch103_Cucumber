@personel_olusturma
Feature: personel_olusturma

  Scenario Outline: TC01_personel_olustur
    Given kullanici "https://editor.datatables.net/" gider
    When kullanici new butonuna tiklar
    And kullanici first_name "<first_name>" girer
    And kullanici last_name "<last_name>" girer
    And kullanici positions "<positions>" girer
    And kullanici office "<office>" girer
    And kullanici extension "<extension>" girer
    And kullanici startdate "<start_date>" girer
    And kullanici salary "<salary>" girer
    And kullanici create butonuna tiklar
    When kullanici first_name ile "<first_name>" ile arar
    Then kullanici "<first_name>" in olustugunu test eder
    Then close the application


    Examples:
      | first_name   | last_name | positions | office    | extension | start_date | salary |
      | Abizittin    | Z         | QA        | Vancouver | Senior    | 2024-02-28 | 55000  |
      | Mahmutzittin | M         | Developer | Toronto   | Junior    | 2024-01-28 | 75000  |
