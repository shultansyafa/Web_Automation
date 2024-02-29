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

'web.feature'

@web
Feature: web

LOGIN:

@web

  Scenario: Login using valid email and password
  
    Given user is on login page
    
    And user input username with "standard_user"
    
    And user input password with "secret_sauce"
    
    When user click login button
    
    Then user is on homepage

  @web
  
  Scenario: Login using invalid email and password
  
    Given user is on login page
    
    And user input username with "standard_user"
    
    And user input password with "invalid"
    
    When user click login button
    
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"

  @web
     
  Scenario: user login without filling in the registered username and password
  
    Given user is on login page
    
    When user click login button
    
    Then user able to see error message "Epic sadface: Username is required"


  @web
  
  Scenario: Verify that the entered password does not contain visible letters/numbers
  
    Given user is on login page
    
    And user input username with "standard_user"
    
    And user input password with "secret_sauce"
    
    When user click login button
    
    Then When the user enters the password, the password is hidden (not visible)

  @web
  
  Scenario: Log in using the blocked username and password
  
    Given user is on login page
    
    And user input username with "locked_out_user"
    
    And user input password with "secret_sauce"
    
    When user click login button
    
    Then user able to see error message "Epic sadface: Sorry, this user has been locked out."

    
 HOMEPAGE:

 @web
 
 scenario:user adds a product to the cart

    Given user is on login page
   
    And user input username with "standard_user"
   
    And user input password with "secret_sauce"
     
    And user click login button
    
    When user adds the first product to the cart
    
    Then user should see the product added to the cart

   @web
   
   Scenario: user checks the shopping cart
   
     Given user is on login page
     
     And user input username with "standard_user"
     
     And user input password with "secret_sauce"
     
     And user click login button
     
     And user has added a product to the cart
     
     When user clicks on the shpping cart icon
     
     Then user should be redirected to the shopping cart page and see the added product
   

   


  ![alt text](![Cuplikan layar 2024-02-29 132257](https://github.com/shultansyafa/Web_Automation/assets/155574309/00534942-40d0-4175-a23b-e205782f1a27)
?raw=true)




