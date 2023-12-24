```java
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        System.out.println("Enter your query (or 'exit' to quit): ");
        return scanner.nextLine();
    }

    public void showOutput(String output) {
        System.out.println("AutoGPT Response: " + output);
    }
}
```
