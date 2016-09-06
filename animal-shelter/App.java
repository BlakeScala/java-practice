import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What is the max weight of animals allowed in the house?");
    String stringMaxWeight = console.readLine();
    Integer maxWeight = Integer.parseInt(stringMaxWeight);

    Animal dog = new Animal();
    dog.mName = "Margot";
    dog.mSpecies = "Border Collie";
    dog.mAge = 4;
    dog.mWeight = 50;

    Animal cat = new Animal();
    cat.mName = "Ichi";
    cat.mSpecies = "Cat";
    cat.mAge = 5;
    cat.mWeight = 28;

    Animal pig = new Animal();
    pig.mName = "Appa";
    pig.mSpecies = "Pig";
    pig.mAge = 8;
    pig.mWeight = 180;

    Animal[] animals = { dog , cat , pig};

    System.out.println("Here are animals that aren't too heavy: ");

    for (Animal eachAnimal : animals) {
      if (eachAnimal.insidePet(maxWeight)){
        System.out.println(eachAnimal.mName);
        System.out.println(eachAnimal.mSpecies);
        System.out.println(eachAnimal.mAge);
        System.out.println(eachAnimal.mWeight);
      }
    }
  }
}
