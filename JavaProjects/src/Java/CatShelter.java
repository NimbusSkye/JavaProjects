import java.util.Arrays;
public class CatShelter {
  private Cat[] cats;
  private String name;
  
  public CatShelter (String name) {
    this.name = name;
  }
  public CatShelter (String name, Cat[] c) {
    this.cats = new Cat[c.length];
    for (int i = 0; i < this.cats.length; i++)
      this.cats[i] = c[i];
    this.name = name;
  }
  public void addCat (Cat newcat) {
    Cat[] largershelter = new Cat [this.cats.length + 1];
    for (int i = 0; i < this.cats.length; i++) 
      largershelter[i] = cats[i];
    largershelter[this.cats.length] = newcat;
    this.cats = largershelter;
  }
  public static void main (String args[]) {
    Cat[] cats = new Cat [5];
    for (int i = 0; i < cats.length; i++)
      cats[i] = new Cat ("Sus", 2);
    Cat newcat = new Cat ("Joj", 3);
    CatShelter shelter = new CatShelter ("Not a cat shelter", cats);
    System.out.println (Arrays.toString(shelter.cats));
    shelter.addCat (newcat);
    System.out.println (Arrays.toString(shelter.cats));
    CatShelter newshelter = new CatShelter ("Empty Shelter");
    System.out.println (Arrays.toString(newshelter.cats));
}
}