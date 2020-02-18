public class Cat {
  private String name;
  private int age;
  private static int numCats;
  public Cat (String name, int age) {
    this.name = name;
    this.age = age;
    numCats++;
  }
  public Cat (String name) {
    this.name = name;
    this.age = 0;
    numCats++;
  }
  public Cat (int age) {
    this.age = age;
    numCats++;
  }
  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }
  public static int getNumCats() {
    return numCats;
  }
  public void setName(String name) {
    this.name = name;
  }
  public boolean isOlderThan (Cat cat) {
    if (this.age > cat.age)
      return true;
    else
      return false;
  }
  public static Cat findOldest (Cat c1, Cat c2) {
    if (c1.isOlderThan(c2))
      return c1;
    else
      return c2;
  }
  public String toString () {
    return this.name + " is " + this.age;
  }
  public static Cat findOldest (Cat[] cats) {
    int oldestage = 0;
    Cat thiccestcat = cats[0];
    for (int i = 1; i < cats.length; i++) {
      if (thiccestcat.age < cats[i].age) {
        thiccestcat = cats[i];
        oldestage = thiccestcat.age;
      }
    }
    return thiccestcat;
  }
  public static void main (String args[]) {
    //String sus = "cat";
    Cat[] cats = new Cat [5];
    for (int i = 0; i < cats.length; i++) {
      cats[i] = new Cat ("Cat " + i, (15 + 2)*i);
      System.out.println (cats[i].name + ", age " + cats[i].age);
    }
    System.out.println (numCats + " cats");
    System.out.println (cats[2].isOlderThan(cats[1]));
    System.out.println (findOldest(cats) + " and is the oldest.");
}
}