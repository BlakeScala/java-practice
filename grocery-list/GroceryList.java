public class GroceryList {
  public static void main(String[] args) {
    String[] myGroceryList = {"sorbet", "hot sauce", "tofurky", "bananas", "beans", "rice"};
    Integer[] groceryItemPrices = {3, 6, 4, 2, 4, 4 };

    for ( Integer index = 0; index < myGroceryList.length ; index++){
      System.out.println( myGroceryList [index] );
    }
  }
}
