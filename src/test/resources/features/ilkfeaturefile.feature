@google_search
Feature: ilk feature file

  @Background:  Google'a git
    Given kullanici Google'a gider


  @iPhone
  Scenario: TC01_google_iPhone_arama
    When kullanici iphone kelimesini aratir
    Then sonucun iphone içerdiğini dogrular
    Then close the application


  @tesla
  Scenario: TC02_google_tesla_arama
    When kullanici tesla kelimesini aratir
    Then sonucun tesla oldugunu dogrular
    Then close the application



#  1. Her feature file, Feature: kelimesi ile başlamak zorundadır
#  2. Her vir file da, yalnız bir Feature: kullanılabilir
#  3. Senaryo(TEST CASE) oluşturmak için Scenerio: kelimesi kullanılır
#  4. Birden fazla Scenerio: kullanılabilir
#  5. Her bir adım Given, When, And, Then, But, * kelimelerinden biriyle başlamalıdır.
#  6. Given -> Genelde ilk satırlarda, pre condition stepleri için kullanılır.
#  7. Then -> Genelde son satırlarda, verification stepleri için kullanılır.
#  8. And, When -> Genelde ara adımlarda bağlaç olarak kullanılır.
#  NOTE: Teknik olarak istenilen kelime istenilen stepte kullanılabilir,
#        ama anlam karmaşası olmaması için bu adımlar takip edilir.
#  9. Belirli Scenerio ları çalıştırmak için cucumber tags ler kullanılır
#  tag ler Feature, Scenario, Scerio Outline, Examples kelimeleri ile birlikte kullanilabilir
#  10. Background: Her bir senaryo kelimesinden önce tek bir sefer çalışır