import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What is the max weight of animals allowed in the house?");
    String stringMaxWeight = console.readLine();
    Integer maxWeight = Integer.parseInt(stringMaxWeight);

    Animal dog = new Animal("Margot", "Border Collie", 4, 50, true);
    Animal cat = new Animal("Ichi", "Cat", 5, 28, false);
    Animal pig = new Animal("Appa", "Pig", 8, 180,true);

    Animal[] animals = { dog , cat , pig};

    System.out.println("Here are animals that aren't too heavy: ");

    for (Animal eachAnimal : animals) {
      if (eachAnimal.insidePet(maxWeight)){
        System.out.println(eachAnimal.mName);
        System.out.println(eachAnimal.mSpecies);
        System.out.println(eachAnimal.mAge);
        System.out.println(eachAnimal.mWeight);
      }
      if (eachAnimal.isAdopted( boolean adopted)) {
        System.out.println(eachAnimal + " has been adopted!");
      }
    }
  }
}
