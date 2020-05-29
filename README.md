# iLab Test Automation Assessment - Selenium

The aim of this project is to create an automated test case in Selenium using the iLAB website as the system under test.

## Getting Started

This is a Maven project based on Page Factory design pattern. To access this project, import this project directly from github into your IntelliJ IDE or clone the Repository in your local machine and open the Maven project from your local directory into IntelliJ.

## Prerequisites

```bash
IntelliJ IDEA Community 2018.x
JDK-1.8.x
Chrome Web browser
Firefox
Microsoft Excel
```

## Installing - following the instructions from the links
```bash
Download and Install:
1.	IntelliJ IDE  - https://www.guru99.com/intellij-selenium-webdriver.html#2
2.	JDK  - https://docs.oracle.com/javase/7/docs/webnotes/install
3.	Chrome - https://support.google.com/chrome/answer/95346?co=GENIE.Platform%3DDesktop&hl=en-GB
4.  Firefox - https://www.mozilla.org/en-US/firefox/new/
```

## Framework
Hybrid - Keyword driven and Data driven

### Tools and Technology used
```bash
Web Testing Framework: Selenium Webdriver
Build Tool: Maven
Testing Tool: TestNG
Programming Language: Java
Version Control: Git
Hosting Service: GitHub
Data storage: MongoDB, Microsoft Excel, properties file
Reporting: maven surefire report
```

### Plugins and Dependencies used
```bash
Selenium-java
TestNG
WebDriverManager
Mongo-db-driver
apache poi api
apache poi-ooxml
maven-surefire-report-plugin
maven-surefire-plugin
```

### Design
```bash
Framework consists of following modules / packages:
•	common (contains setup classes to be used across the project), 
•	pages (contains web applications page factory), 
•	tests (contains web tests for the iLab website) 
```

```bash
Data storage files are kept in test resources folder and mongodb is hosted on the cloud as a cluster. ilab.properties files stores the browser name, test url and reference id which will be used to access a specific document in mongodb.
ilab_TestPlan.xlsx stores the expected results.
```

## Running the tests with TestNG

```bash
The framework currently support chrome and firefox browser. Browser can be specified in the ilab.properties file at selenium.browser.name. 
```

```bash
Option one:
•	right-click on testng.xml file
•	click Run
```

```bash
Option two:
•	right-click on JobApplicationTest class
•	click Run
```

```bash
Option three:
•	If you have maven installed; type 'mvn clean test' via Intellij Terminal
•	Else; Click on Maven Tool Window > Click Lifecycle > Click clean > then Click test
•	A testNG will be generated under target/surefire-reports. You may open the index.html file via a browser
```
