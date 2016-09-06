class Animal {
  public String mName;
  public String mSpecies;
  public int mAge;
  public int mWeight;
  public boolean mAdopted;

  public Animal(String name, String species, int age, int weight, boolean adopted) {
    mName = name;
    mSpecies = species;
    mAge = age;
    mWeight = weight;
    mAdopted = adopted;
  }

  public boolean isAdopted(boolean adopted){
    return mAdopted = !(adopted);
  }

  public boolean insidePet(int maxWeight){
    return (maxWeight >= mWeight);
  }
}
