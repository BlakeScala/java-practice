import java.io.Console;

public class RatedR {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("How old are you?");
    String stringUserAge = myConsole.readLine();
    Integer integerUserAge = Integer.parseInt(stringUserAge);

    if ( integerUserAge >= 17 ) {
      System.out.println("Get in there, yo!");
    } else {
      System.out.println("Get the hell outta here, you're too young!");
    }
  }
}
