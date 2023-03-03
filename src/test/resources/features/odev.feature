@odev
Feature: blue_rental_login_feature

  Scenario Outline: TC01_login_test
    Given kullanici "https://www.bluerentalcars.com/" gider
    When kullanici login butonuna tiklar
    And kullanici email "<email>" alanina datayi girer
    And kullanici password "<password>" alanina datayi girer
    And kullanici mavi login butonuna tiklar
    Then kullanici ismini "<kullanici_isim>" ekranda gorundugunu dogrular
    Then close the application


    Examples:
      | email                          | password  | kullanici_isim |
      | sam.walker@bluerentalcars.com  | c!fas_art | Sam Walker     |
      | kate.brown@bluerentalcars.com  | tad1$Fas  | Kate Brown     |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  | Raj Khan       |
      | pam.raymond@bluerentalcars.com | Nga^g6!   | Pam Raymond    |


  Scenario Outline: TC02_negative_login_test
    Given kullanici "https://www.bluerentalcars.com/" gider
    When kullanici login butonuna tiklar
    And kullanici email "<email>" alanina datayi girer
    And kullanici password "<password>" alanina datayi girer
    And kullanici mavi login butonuna tiklar
    Then kullanici user not found uyarisinin ekranda gorundugunu dogrular
    Then close the application


    Examples:
      | email                          | password       |
      | sam.walker@bluerentalcars.com  | yanlisSifre123 |
      | yanlisEmail@bluerentalcars.com | tad1$Fas       |