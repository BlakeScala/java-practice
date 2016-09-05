import java.io.Console;

public class Addition {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a number");
    String numberOneString = myConsole.readLine();
    System.out.println("Give me another one");
    String numberTwoString = myConsole.readLine();

    Integer numberOne = Integer.parseInt(numberOneString);
    Integer numberTwo = Integer.parseInt(numberTwoString);
    Integer numberSum = (numberOne + numberTwo);

    String stringNumberSum = Integer.toString(numberSum);
    System.out.println("The sum is " + numberSum);
  }
}
