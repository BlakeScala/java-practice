import java.io.Console;

public class Temperature {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What is the temperature outside?");
    String stringTemperature = myConsole.readLine();

    Integer temperature = Integer.parseInt(stringTemperature);

    if ( temperature < 10) {
      System.out.println("You might die");
    } else if ( temperature <= 40 ) {
      System.out.println("Bundle Up!");
    } else if ( temperature > 40 && temperature < 60 ) {
      System.out.println("Little chilly!");
    } else if ( temperature > 60 && temperature < 80 ) {
      System.out.println("Comfortable Day!");
    } else if ( temperature > 80 ){
      System.out.println("Hot day!");
    }
  }
}
