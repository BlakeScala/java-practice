import java.io.Console;

public class EvenOdd {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter a number.");
    String stringUserNumber = console.readLine();
    Integer userNumber = Integer.parseInt(stringUserNumber);

    for ( Integer index = 0 ; index <= userNumber ; index++ ) {
      if (index % 2 == 0) {
        System.out.println(index + " -- even");
      } else {
        System.out.println(index + " -- odd");
      }
    }
  }
}
