import java.io.Console;

public class Multiplication {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a number");
    String numberOneString = myConsole.readLine();
    System.out.println("Give me another number");
    String numberTwoString = myConsole.readLine();

    Integer numberOne = Integer.parseInt(numberOneString);
    Integer numberTwo = Integer.parseInt(numberTwoString);
    Integer numberProduct = numberOne * numberTwo;

    String numberProductString = Integer.toString(numberProduct);
    System.out.println("The product is " + numberProductString);
  }
}
