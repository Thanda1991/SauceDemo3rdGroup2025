This project is a test automation framework for the [SauceDemo](https://www.saucedemo.com/) website. It is built using Java, Selenium WebDriver, TestNG, and Maven, following the Page Object Model (POM) design pattern.

## Technologies Used
* **Java**: Programming language.
* **Selenium WebDriver**: Browser automation tool.
* **TestNG**: Testing framework for assertions and test execution.
* **Maven**: Build and dependency management tool.
* **ExtentReports**: For detailed HTML test reports.
* **Apache POI**: For handling Excel-based test data.
* **Lombok**: To reduce boilerplate code.

## Project Structure
```text
SauceDemo3rdGroup2025/
├── src/
│   └── test/
│       └── java/
│           ├── Pages/              # Page Object classes (POM)
│           │   ├── CartPage.java
│           │   ├── HomePage.java
│           │   ├── LoginPage.java
│           │   ├── CheckoutPage.java
│           │   ├── ...
│           ├── Tests/              # Test scripts
│           │   ├── Base.java
│           │   ├── LoginTest.java
│           │   └── PurchaseProductsTest.java
│           ├── Utils/              # Utility classes
│           │   ├── BrowserFactory.java
│           │   ├── ReadFromFile.java
│           │   └── ...
│           ├── TestData/           # Test data management
│           │   └── data.xlsx
│           └── ExtentReports/      # Reporting configuration
│               ├── Listener.java
│               └── ExtentReportManager.java
├── Reports/                        # Test report output
├── testng.xml                      # Test suite configuration
└── pom.xml                         # Maven dependencies & plugins
```

## Getting Started

### Prerequisites
* Java JDK 11 or higher.
* Maven installed and configured.
* A modern web browser (Chrome is configured by default).

### Installation
1. Clone the repository.
2. Navigate to the project directory.
3. Install dependencies:
   ```bash
   mvn clean install
   ```

## Running Tests
You can run tests in multiple ways:

### Using Maven
Run all tests defined in `testng.xml`:
```bash
mvn test
```

### Using TestNG
Right-click on the `testng.xml` file in your IDE and select **Run**.

## Reporting
After the test execution completes, an ExtentReport is generated. You can find the reports in the `Reports/` directory.
Open the generated `.html` file in a browser to view the detailed results.
