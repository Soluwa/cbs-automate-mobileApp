# cbs-automate-mobileApp
This is a remote repository for the BDD automation framework for mobile app authentication. The project is a maven project, designed using appium client with java API
binding. the framework also uses Cucumber, so test steps are writen in the feature file before they are implemented in the stepdefinition file.
The test runs using TestNG from the runner class. The framework is and hybrid framework (Android and iOS), it also runs versions of the various
OS on emulators and simulators. Before running any test locally, ensure the appium server is started via the termial or using the appium desktop
.The emulator/simulator should also be launched prior to running the test. All required dependencies for this framework can be found in its 
pom.xml. The test can also be run from the terminal with maven surefire ( mvn clean install)
