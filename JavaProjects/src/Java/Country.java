package Java;
import java.util.Random;
public class Country {
  private String name;
  private Community[] communities;
  private int numCommunities;
  private static Random rng = new Random ();
  public Country (String name) {
    this.name = name;
    this.communities = new Community [50];
  }
  public String getName () {
    return this.name;
  }
  public void addCommunity (Community c) {
    int index = 0;
    for (int i = 0; i < communities.length; i++) {
      if (communities[i] == null) {
        index = i;
        break;
      }
    }
    communities[index] = c;
    numCommunities++;
  }
  public Community computeSmallestCity () {
    int index = -1;
    Community smallest = null;
    for (int i = 0; i < numCommunities; i++) {
      if (communities[i].isCity()) {
        smallest = communities[i];
        index = i;
        break;
      }
    }
    //System.out.println (communities[index]);
    for (int i = 0; i < numCommunities; i++) {
      if (communities[i].isCity() && communities[i].isSmallerThan(smallest)) {
        smallest = communities[i];
        index = i;
      }
    }
    if (index < 0)
      return null;
    return communities[index];
  }
  public static void main (String args[]) {
    Country russia = new Country ("Russia"); 
    char[] randomchars = new char [5];
    for (int i = 0; i < 50; i++) {
      for (int j = 0; j < randomchars.length; j++)
        randomchars[j] = (char)(rng.nextInt(26) + 'a');
      String name = new String (randomchars);
      Community lol = new Community (name, 100000 * (i/2 + 5), 1986);
      russia.addCommunity(lol);
    }
    System.out.println (russia.computeSmallestCity());
    System.out.println (russia.numCommunities);
}
}