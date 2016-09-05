import java.io.Console;

public class Division {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a number");
    String numberOneString = myConsole.readLine();
    System.out.println("Give me another number");
    String numberTwoString = myConsole.readLine();

    Integer numberOne = Integer.parseInt(numberOneString);
    Integer numberTwo = Integer.parseInt(numberTwoString);
    Integer numberQuotient = numberOne / numberTwo;

    String numberQuotientString = Integer.toString(numberQuotient);
    System.out.println("The quotient is " + numberQuotientString);
  }
}
