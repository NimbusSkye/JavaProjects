package Java;
public class Community {
  private String name;
  private int population;
  private int yearFounded;
  private static final int mincitysize = 1000000;
  public Community (String name, int population, int yearFounded) {
    if (population < 0)
      throw new IllegalArgumentException ("The city cannot have a negative population.");
    this.name = name;
    this.population = population;
    this.yearFounded = yearFounded;
  }
  public boolean isCity () {
    if (this.population >= mincitysize)
      return true;
    else
      return false;
  }
  public boolean isSmallerThan (Community c) {
    if (this.population < c.population)
      return true;
    else
      return false;
  }
  public String getName () {
    return this.name;
  }
  public String toString () {
    return this.name + ", with a population of " + this.population;
  }
}
  