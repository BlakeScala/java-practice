public class App {
  public static void main(String[] args) {
    
    Animal dog = new Animal();
    dog.mName = "Margot";
    dog.mSpecies = "Border Collie";
    dog.mAge = 4;

    Animal cat = new Animal();
    cat.mName = "Ichi";
    cat.mSpecies = "Cat";
    cat.mAge = 5;

    Animal pig = new Animal();
    pig.mName = "Appa";
    pig.mSpecies = "pig";
    pig.mAge = 8;

    Animal[] animals = { dog , cat , pig};

    System.out.println("All animals: ");

    for (Animal eachAnimal : animals) {
      System.out.println(eachAnimal.mName);
      System.out.println(eachAnimal.mSpecies);
      System.out.println(eachAnimal.mAge);
    }
  }
}
