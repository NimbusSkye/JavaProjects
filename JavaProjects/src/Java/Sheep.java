package Java;//Name: Yufeng Wang
//Student ID: 260855204

import java.util.Random;
public class Sheep {
  private String name;
  private int age;
  private boolean hasWool;
  private static Random randomNumber = new Random (123);
  public Sheep (String name, int age) {
    this.name = name;
    this.age = age;
    hasWool = true;
  }
  public String getName () {
    return this.name;
  }
  public int getAge () {
    return this.age;
  }
  public double shear () {
    if (this.hasWool == false)
      return 0;
    this.hasWool = false;
    return randomNumber.nextDouble() * 4.0 + 6.0;
  }
}