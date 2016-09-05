import java.io.Console;

public class TwoDigits {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a number and I'll tell you if it has two digits or not!");
    String stringInputNumber = myConsole.readLine();
    Integer inputNumber = Integer.parseInt(stringInputNumber);

    if (inputNumber >= 10 && inputNumber <= 99){
      System.out.println("THAT'S TWO DIGITS HOLY SHIIIIIIIIIIIII-");
    } else {
      System.out.println("Nah, that ain't even two digits, bruh.");
    }
  }
}
