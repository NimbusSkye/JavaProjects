package Java;

import java.util.Random;
public class Cocktail {
  private String name;
  private double price;
  private String[] ingredients;
  private Random rng = new Random ();
  public Cocktail (String name, String[] ingredients) {
    if (ingredients == null || ingredients.length < 3)
      throw new IllegalArgumentException ();
    this.name = name;
    this.price = rng.nextDouble() * 5 + 10;
    this.ingredients = ingredients;
  }
  public String getName() {
    return this.name;
  }
  public double getPrice() {
    return this.price;
  }
  public static Cocktail selectBest (Cocktail a, Cocktail b) {
    double ratioA = a.price / a.ingredients.length;
    double ratioB = b.price / b.ingredients.length;
    if (ratioB < ratioA)
      return b;
    else
      return a;
  }
}