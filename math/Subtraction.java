import java.io.Console;

public class Subtraction {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a number");
    String numberOneString = myConsole.readLine();
    System.out.println("Give me another number");
    String numberTwoString = myConsole.readLine();

    Integer numberOne = Integer.parseInt(numberOneString);
    Integer numberTwo = Integer.parseInt(numberTwoString);
    Integer numberDiff = numberOne - numberTwo;

    String numberDiffString = Integer.toString(numberSum);
    System.out.println("The difference is " + numberDiffString);
  }
}
