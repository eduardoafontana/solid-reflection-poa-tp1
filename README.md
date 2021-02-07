# General explanation of the implementation
Examples of implementation of the SOLID principle and reflection were developed using the Visual Studio Code IDE, using Java 8 with SpringBoot.
The project uses Maven as a manager of packages and external libraries.

When running the application, nothing is returned to the screen, as the examples were implemented using tests through the JUnit.Jupiter library. Thus, there is no presence of System.out.println in the classes.

To understand the source code, you need to read the test methods, as well as the asserts commands, which ensure that the runtime works. The test methods are the documentation of the source code.

# Implementation guidelines

- To compile and start the application, the following command must be run from the application root path:
.\mvnw spring-boot:run

- To start the tests, the following command must be run from the application root path:
.\mvnw clean package

- The source files are located in the path:
src\main\java\com

- The source files for the test are located in the path:
src\test\java\com

- The compiled files are located in the folder:
target