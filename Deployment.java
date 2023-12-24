```java
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Deployment {

    private SystemArchitecture systemArchitecture;

    public Deployment(String modelPath) {
        systemArchitecture = new SystemArchitecture(modelPath);
    }

    public void deploy() {
        try {
            // Start the system
            systemArchitecture.run();

            // Wait for the system to finish
            while (systemArchitecture.isRunning()) {
                Thread.sleep(1000);
            }

            // Close the system
            systemArchitecture.close();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Deployment deployment = new Deployment("path/to/model");
        deployment.deploy();
    }
}
```
