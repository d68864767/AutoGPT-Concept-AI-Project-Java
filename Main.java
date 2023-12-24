```java
public class Main {

    public static void main(String[] args) {
        // Initialize the system architecture with the path to the model
        SystemArchitecture systemArchitecture = new SystemArchitecture("path/to/model");

        // Run the system
        systemArchitecture.run();

        // Close the system architecture after use
        systemArchitecture.close();
    }
}
```
