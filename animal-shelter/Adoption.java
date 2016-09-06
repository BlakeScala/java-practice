class Animal {
  public String mName;
  public String mSpecies;
  public int mAge;
  public int mWeight;

  public Animal(String name, String species, int age, int weight) {
    mName = name;
    mSpecies = species;
    mAge = age;
    mWeight = weight;
  }

  public boolean insidePet(int maxWeight){
    return (maxWeight >= mWeight);
  }
}
