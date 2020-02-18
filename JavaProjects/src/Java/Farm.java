package Java;//Name: Yufeng Wang
//Student ID: 260855204

public class Farm {
  private Sheep[] sheep;
  private Dog dog;
  private String name;
  public Farm (String name, Dog dog, Sheep[] sheep) {
    if (sheep.length > dog.herd())
      throw new IllegalArgumentException ("This breed of dog cannot herd this many sheep.");
    this.name = name;
    this.dog = dog;
    this.sheep = sheep;
  }
  public String getName () {
    return this.name;
  }
  public int getNumSheep () {
    return this.sheep.length;
  }
  public void printFarm () {
    System.out.println ("This farm's name is " + this.getName() + ".");
    System.out.println ("The farm dog's name is " + this.dog.getName() + ".");
    for (int i = 0; i < sheep.length; i++) {
      System.out.println (this.sheep[i].getName() + " " + this.sheep[i].getAge());
    }
  }
  public double getWool () {
    double wool = 0;
    for (int i = 0; i < sheep.length; i++)
      wool = wool + this.sheep[i].shear();
    return wool;
  }
}