import java.io.Console;

public class Hotel {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("In what season are you booking a stay?");
    String season = console.readLine();

    System.out.println("On a weekend or a weeknight?");
    String dayOfWeek = console.readLine();

    boolean summer = season == "summer";
    boolean weekend = dayOfWeek == "weekend";

    if ( summer && weekend ) {
      System.out.println("Your stay is probably going to be pretty expensive. It's both peak travel season AND the weekend.");
    } else if ( summer || weekend) {
      System.out.println("You're staying in the summer, so it might be pretty expensive.");
    } else {
      System.out.println("Your stay might be expensive, but it could certainly be worse!");
    }
  }
}
