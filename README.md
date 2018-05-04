# Lombok example
[Project Lombok](https://projectlombok.org/) is a library to save time and lines of code. 

This example project should show the benefits and how to use it by implementing the same classes with and without Lombok.
The test classes have the purpose to use the lombokified classes, they aren't thought to be real tests ;)

### Examples
- `Person` represents a simple DTO class with getters, setters, different constructors and toString-, hashcode- and equals-method.
- `Credentials` is the same, but in an immutable way.
- `ClientConfiguration` implements the Builder-pattern
- `Output` is logging information to console

### Notes
- IDEs usually require plugins, please follow the [official page](https://projectlombok.org/setup/intellij) for installation instructions.