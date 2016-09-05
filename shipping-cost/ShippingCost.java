import java.io.Console;

public class ShippingCost {
  public static void main(String[] args) {
    Console myConsole = System.console();
  System.out.println("How much does your package weigh?");
  String packageWeightString = myConsole.readLine();
  System.out.println("How many miles will it travel?");
  String distanceString = myConsole.readLine();
  System.out.println("How many are you going to buy?");
  String amountShippedString = myConsole.readLine();

  Integer packageWeight = Integer.parseInt(packageWeightString);
  Integer distance = Integer.parseInt(distanceString);
  Integer numberOfItems = Integer.parseInt(amountShippedString);

  Integer costOfShipping = (( packageWeight / 5 ) + (distance / 5)) * numberOfItems;

  String shippingCost = Integer.toString(costOfShipping);

  System.out.println("Shipping will cost you $" + shippingCost + ".00!");
  }
}
