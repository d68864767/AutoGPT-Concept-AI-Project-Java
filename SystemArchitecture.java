```java
import ai.djl.Model;
import ai.djl.inference.Predictor;
import ai.djl.modality.nlp.qa.QAInput;
import ai.djl.modality.nlp.qa.QAOutput;

public class SystemArchitecture {

    private AutoGPTModel autoGPTModel;
    private UserInterface userInterface;

    public SystemArchitecture(String modelPath) {
        autoGPTModel = new AutoGPTModel(modelPath);
        userInterface = new UserInterface();
    }

    public void run() {
        while (true) {
            String input = userInterface.getInput();
            if (input.equals("exit")) {
                break;
            }
            String output = autoGPTModel.predict(input);
            userInterface.showOutput(output);
        }
    }

    public void close() {
        autoGPTModel.close();
    }

    public static void main(String[] args) {
        SystemArchitecture systemArchitecture = new SystemArchitecture("path/to/model");
        systemArchitecture.run();
        systemArchitecture.close();
    }
}
```
