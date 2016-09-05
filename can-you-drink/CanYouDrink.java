import java.io.Console;

public class CanYouDrink{
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What is your age?");
    String stringUserAge = myConsole.readLine();
    Integer intUserAge = Integer.parseInt(stringUserAge);

    if (intUserAge >= 21){
      System.out.println("LEZGETSLOSHED");
    } else {
      System.out.println("You too young, go drink by yourself.");
    }
  }
}
