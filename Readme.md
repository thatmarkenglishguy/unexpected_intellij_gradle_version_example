# Unexpected Intellij Example
[IntelliJ issue](https://youtrack.jetbrains.com/issue/IDEA-211778)

## Scenario
A library where version 1 contains a class, and version 2 deletes that class and contains a different class.  
An app which depends on both version 1 and version 2 of the library.

Building the app from the command line fails.

## To Demonstrate
1. Clone or download this git repository to a machine which has:
* Bash shell (tested on Mac with 3.2.57(1))
* IntelliJ installed (tested with 2019.1)
* Gradle and Java (tested with Gradle 5.4 and Java 11.0.2) available on the commmand line e.g. by including them on the PATH.
* Network connection (for dependencies on external artifacts)
2. Open a terminal in the downloaded repo directory.
3. Run `./mess_with_dependencies`
4. Follow instructions on the command line.

## Expected Behaviour
IntelliJ highlights the potential problems in the Gradle source sets having two versions of the same library, and underlines in red the lines which would fail to build.

## Actual Behaviour
No IntelliJ IDE highlighted error in the app tests, and tests pass.

## To reset
1. Open a terminal in the downloaded repo directory.
2. Run `./cleanup`

