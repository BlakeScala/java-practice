import java.io.Console;

public class StartsWithZ {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What is your name?");
    String userName = myConsole.readLine();

    if (userName.startsWith("Z") || userName.startsWith("z") ) {
      System.out.println("Your name starts with Z!");
    } else {
      System.out.println("Your name doesn't start with Z:(");
    }
  }
}
