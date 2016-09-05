import java.io.Console;

public class Encryption {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a sentence to be encrypted.");
    String userInput = myConsole.readLine();

    String encryptedInput = userInput.replaceAll("a", "x");
    System.out.println(encryptedInput);
  }
}
