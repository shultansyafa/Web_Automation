1.Deskripsi sturktur

-src/test/java/page/: Berisi kelas-kelas yang mewakili halaman web dan mengimplementasikan pola Model Objek Halaman.

-src/test/java/runner/:tempat untuk menempatkan file-file yang terkait dengan jalannya pengujian dalam proyek menggunakan Cucumber.

-src/test/java/stepDef/:Berisi kelas-kelas yang menentukan langkah-langkah definisi untuk skenario pengujian menggunakan Cucumber.

-src/test/resources:Berisi file Gherkin '.feature' yang berisi skenario pengujian.


2.Implementasi

-page object model(POM):setiap halaman web direpresentasikan sebagai kelas java terpisah di dalam paket 'page'.contoh 'HomePage.java' akan berisi metode untuk berinteraksi dengan elemen di halaman berbeda.

-Cucumber Step Definition:paket 'stepDef' mendefinisikan langkah-langkah untuk skenario pengujian gherkin.

-Test cases(Gehrkin syntax):file 'login.feature' berisi skenario pengujian menggunaka gherkin syntax.

-Cucumber Implementation:framework menggunakan Cucumber untuk menjalankan skenario pengujian Gherkin dan membuat laporan.


3.Contoh Test case

'login.feature'

@login
Feature: Login

@valid-login

  Scenario: Login using valid email and password
  
    Given user is on login page
    
    And user input username with "standard_user"
    
    And user input password with "secret_sauce"
    
    When user click login button
    
    Then user is on homepage

  @invalid-login
  
  Scenario: Login using invalid email and password
  
    Given user is on login page
    
    And user input username with "standard_user"
    
    And user input password with "invalid"
    
    When user click login button
    
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"




