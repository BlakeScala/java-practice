class Animal {
  public String mName;
  public String mSpecies;
  public int mAge;
  public int mWeight;

  public boolean insidePet(int maxWeight){
    return (maxWeight >= mWeight);
  }
}
