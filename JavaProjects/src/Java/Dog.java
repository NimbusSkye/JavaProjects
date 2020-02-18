package Java;//Name: Yufeng Wang
//Student ID: 260855204

public class Dog {
  private String name;
  private String breed;
  public Dog (String name, String breed) {
    this.name = name;
    this.breed = breed;
  }
  public String getName () {
    return this.name;
  }
  public int herd () {
    if (this.breed.toLowerCase().contains("collie"))
      return 20;
    if (this.breed.toLowerCase().contains("shepherd"))
      return 25;
    if (this.breed.toLowerCase().contains("kelpy") || this.breed.toLowerCase().contains("teruven"))
      return 30;
    else
      return 10;
  }
}