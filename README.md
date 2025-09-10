Mempersiapkan library, dependencies (Selenium, Cucumber), test framework JUnit Platform, konfigurasi Cucumber Runtime dalam 1 file build.gradle

Menuliskan test case dengan format gherkin dalam file login.feature dan disimpan pada direktori resources

Test case terdiri dari valid login, invalid login dan input data kosong

Membuat page object model dalam class java (LoginPage dan HomePage)

Mempersiapkan step definition berdasarkan masing-masing page object model (LoginStepDef dan HomeStepDef) termasuk test before dan after class (Cucumber Hooks)

Membuat class java BaseTest untuk memanggil WebDriver Chromebrowser dan Selenium

Mempersiapkan class java test runner CucumberTest untuk running test cucumber (testing juga bisa dilakukan dari file login.feature) dan menghasilkan test report

Report test tersimpan pada direktori reports (di bawah level nama project) dalam format .html

Menambahkan file .gitattributes (opsional) untuk menampilkan bahasa yang dipakai (pada repo github) serta menghilangkan warning dari hasil running nya
