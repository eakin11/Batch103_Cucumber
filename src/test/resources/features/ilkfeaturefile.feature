@google_search
Feature: ilk feature file

  Background: Google_sayfasina_git
    Given kullanici Google'a gider

  @smoke
  Scenario: TC01_google_iphone_arama
    When kullanici iphone kelimesini aratir
    Then sonucun iphone içerdiğini dogrular
    Then close the application


  Scenario: TC02_google_tesla_arama
    When kullanici_tesla_kelimesini_aratir
    Then sonucun tesla oldugunu dogrular
    Then close the application











#  1. Her feature file, Feature: kelimesi ile baslamak zorundadir
#  2. Her bir file da, yanliz bit Feature: kullanilabilir
#  3. Senaryo(TEST CASE) olusturmak icin Scenario kelimesi kullanilir
#  4. Birden fazla Scenario: kullanilabilir
#  5. Her bir adim Given,When,And,Then,But,* kelimelerinden biriyle baslamalidir.
#  6. Given -> Genelde ilk satirlarda, pre condition stepleri icin kullanilir
#  7. Then -> Genelde son satirlarda, verification stepleri icin kullanilir
#  8. And, When -> Genelde ara adimlarda baglar olarak kullanilir
#  NOTE: Teknik olarak istenilen kelime isteniler step de kullanilabilir,
#        ama anlam karmasasi olmamasi icin bu adimlar takip edilir
#  9. Belirli Scenario lari calistirmak icin cucumber tags ler kullanilir
#  tag ler Fetuature, Scenario, Scerio Outline, Examples kelimeleri ile birlikte kullanilabilir
#  10. Background: Her bir Scenario kelimesinden ONCE tek bir sefer calisir
#  11. dryRun=false -> dryRun yokmus gibi normal sekilde calisir. Yani tum adimlari tek tek browserda acar.
#      dryRun=true  -> Yeni bir STEP(adim) eklendiginde sadece tanimlanmamis step definitions lari olusturmak icin kullanilir
#      kullanilma sebebi zamandan tasarrufdur.