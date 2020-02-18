package Java;

public class Pub {
  private String name;
  private Cocktail[] drinks;
  public Pub (String name, Cocktail[] drinks) {
    this.name = name;
    this.drinks = drinks;
  }
  public String getName() {
    return this.name;
  }
  public Cocktail getBestDrink () {
    Cocktail good = drinks[0];
    for (int i = 0; i < drinks.length; i++) 
      good = Cocktail.selectBest (good, drinks[i]);
    return good;
  }
  public double placeOrder (String drink) {
    for (int i = 0; i < drinks.length; i++) {
      if (drinks[i].getName().equalsIgnoreCase(drink))
        return drinks[i].getPrice();
    }
    return 0.0;
  }
}
      