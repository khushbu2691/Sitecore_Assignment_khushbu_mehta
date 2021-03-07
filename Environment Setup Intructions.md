# Steps to SetUp a test Environment #

----------

## Applications required ##
<table>
<tr>
<td> NAME </td>
<td> VERSION </td>
</tr>
<tr>
<td> OS </td>
<td> Windows 10 </td>
</tr>
<tr>
<td> JAVA </td>
<td> jdk-15.0.2 </td>
</tr>
<tr>
<td> Eclipse </td>
<td> eclipse-java-2020-12-R-win32-x86_64 </td>
</tr>
<tr>
<td> Selenium jar file </td>
<td> selenium-server-standalone-3.141.59.jar </td>
</tr>
<tr>
<td> Chrome Browser </td>
<td> 88.0.4324.190 </td>
</tr>
<tr>
<td> Chrome Webdriver </td>
<td> 88.0.4324.96</td>
</tr>
<tr>
<td> Cucumber </td>
<td> version </td>
</tr>

</table>

## Java installation ##

To install Java and setup a path in the environment, follow the below steps:

1. If Java is already present in the system, it should be present in following directory - C:\Program Files. Jump to step 4.
2. If not, then Download JAVA from the link [https://www.oracle.com/be/java/technologies/javase-jdk15-downloads.html](https://www.oracle.com/be/java/technologies/javase-jdk15-downloads.html) for OS Windows.
3. Set the Enviroment variables by copying the Java HOME path - "C:\Program Files\Java\jdk-15.0.2".
4. Go to - Control Panel\System and Security\System -> Advanced System Settings -> Advanced -> Environment Variables -> System Variables -> New -> Variable name = "JAVA_HOME", Variable value = "C:\Program Files\Java\jdk-15.0.2" save and exit.
5. Find path in Control Panel\System and Security\System -> Advanced System Settings -> Advanced -> Environment Variables -> System Variables - double click and a window pops up. Click on New and add the path "C:\Program Files\Java\jdk-15.0.2\bin". Click ok to save and finish.

## Eclipse IDE Installation ##

Eclipse will help to write and execute the test script.

1. Download eclipse IDE from the link [https://www.eclipse.org/downloads/packages/release/2020-12/r/eclipse-ide-java-developers](https://www.eclipse.org/downloads/packages/release/2020-12/r/eclipse-ide-java-developers) for Windows.
2. Extract the Downloaded zip file.
3. Click on eclipse.exe file in the folder \eclipse-java-2020-12-R-win32-x86_64\eclipse to open the application.

## Selenium Jar files ##

Selnium Jar files will provide the required libs to execute Seleium methods.


1. Download the selenium jar files for Java from the link [https://selenium-release.storage.googleapis.com/3.141/selenium-java-3.141.59.zip](https://selenium-release.storage.googleapis.com/3.141/selenium-java-3.141.59.zip).
2. Shall include all the jar files present in the folder in the project created.

## Chrome Browser version 88.0.4324.190 Installation ##

1. Download Chrome Browser from the link [https://www.google.com/chrome/](https://www.google.com/chrome/)
2. Install the browser by following the steps.

## Chrome WebDriver Installation ##

To run tests on chrome browser, chrome webdriver is required.

1. Download the chrome webdriver from the link [https://chromedriver.storage.googleapis.com/88.0.4324.96/chromedriver_win32.zip](https://chromedriver.storage.googleapis.com/88.0.4324.96/chromedriver_win32.zip)
2. Extract the file to one of the folders in the project.


## Maven Installation ##

To consolidate dependancies, we will require Maven.

1. Download maven zip folder from [https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip](https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip)
2. Extract the folder and create a maven project.
3. Set the Enviroment variables by copying the Maven HOME path - "..\apache-maven-3.6.3-bin\apache-maven-3.6.3".
4. Go to - Control Panel\System and Security\System -> Advanced System Settings -> Advanced -> Environment Variables -> System Variables -> New -> Variable name = "Maven_HOME", Variable value = "..\apache-maven-3.6.3-bin\apache-maven-3.6.3" save and exit.
5. Find path in Control Panel\System and Security\System -> Advanced System Settings -> Advanced -> Environment Variables -> System Variables - double click and a window pops up. Click on New and add the path "\apache-maven-3.6.3-bin\apache-maven-3.6.3\bin". Click ok to save and finish.

