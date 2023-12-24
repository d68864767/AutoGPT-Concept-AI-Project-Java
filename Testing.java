```java
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Testing {

    private SystemArchitecture systemArchitecture;
    private AutoGPTModel autoGPTModel;
    private UserInterface userInterface;

    @BeforeEach
    public void setUp() {
        systemArchitecture = new SystemArchitecture("path/to/model");
        autoGPTModel = new AutoGPTModel("path/to/model");
        userInterface = new UserInterface();
    }

    @Test
    public void testAutoGPTModel() {
        String input = "What is the capital of France?";
        String output = autoGPTModel.predict(input);
        assertEquals("Paris", output);
    }

    @Test
    public void testUserInterfaceInput() {
        String input = userInterface.getInput();
        assertNotNull(input);
    }

    @Test
    public void testSystemArchitecture() {
        assertDoesNotThrow(() -> systemArchitecture.run());
    }

    @AfterEach
    public void tearDown() {
        systemArchitecture.close();
        autoGPTModel.close();
    }
}
```
