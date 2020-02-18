package Java;
import java.util.Scanner;
import java.io.*;
public class CountryStatistics {
  private static boolean x = true;
  public static Country loadCountry (String filename) throws IOException {
    FileReader fr = new FileReader (filename);
    BufferedReader br = new BufferedReader (fr);
    String[] firstline = br.readLine().split(" ");
    Country newcountry = new Country (firstline[0]);
    for (int i = 0; i < Integer.parseInt(firstline[1]); i++) {
      String[] components = br.readLine().split(" ");
      Community newcommunity = new Community (components[0], Integer.parseInt(components[1]), Integer.parseInt(components[2]));
      newcountry.addCommunity (newcommunity);
    }
    br.close();
    fr.close();
    return newcountry;
  }
  public static void main (String args[]) {
    while (x) {
    try {
      Scanner s = new Scanner (System.in);
      String filename = s.nextLine();
    Country mycountry = loadCountry (filename);
    System.out.println ("The smallest city in the country of " + mycountry.getName() + " is " + mycountry.computeSmallestCity() + ".");
    s.close();
    x = false;
  }
    catch (FileNotFoundException e) {
      System.out.println ("File not found!");
      continue;
    }
    catch (IOException e) {
      System.out.println ("IOException");
      continue;
    }
    catch (Exception e) {
      System.out.println ("Some other exception");
      continue;
    }
    }
}
}
    