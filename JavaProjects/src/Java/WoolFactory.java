package Java;

import java.util.Scanner;
import java.util.Random;
public class WoolFactory{
  //The provided code generates random ages for sheep, and picks random names from the below array
  //You can modify this list of names as you wish (add/remove/replace elements).
  private static String[] namesForSheep = {"Cerdic","Cynric","Ceawlin","Ceol","Ceolwulf","Cynegils",
    "Cenwalh","Seaxburh","Aescwine","Centwine","Ceadwalla","Ine","Aethelheard","Cuthred","Cynewulf",
    "Berhtric","Egbert","Aethelwulf","Aethelbald","Aethelberht","Aethelred","Hengest","Aesc","Octa",
    "Eormenric","Aethelbert I","Eadbald","Earconbert","Egbert I","Hlothere","Oswine","Wihtred",
    "Aethelbert II","Sigered","Egbert II","Eadberht II","Cuthred","Baldred","Aethelfrith","Edwin","St. Oswald",
    "Oswiu","Ecgfrith","Aldfrith","Osred I","Cenred","Osric","Ceolwulf","Eadberht",
    "Aethelwald","Alhred","Aethelred I","Aelfwald I","Eardwulf","Eanred","George V","Edward VIII",
    "George VI","Elizabeth II"};
  private static Random r = new Random(123);
  
  //returns a random String from the above array. 
  private static String getRandomName(){
    int index = r.nextInt(namesForSheep.length);
    return namesForSheep[index];
  }
  //returns a random age for a sheep from 1 to 10
  private static int getRandomAge(){
    return r.nextInt(10)+1;
  }
  //End of provided name/age generation code. 
  
  public static void main(String[] args){
    //Student Name: Yufeng Wang
    //Student Number: 260855204
    //Your code goes here.
    Scanner in = new Scanner (System.in);
    String farmname;
    String dogname;
    String dogbreed;
    int numsheep;
    System.out.println ("Enter the name of your farm.");
    farmname = in.nextLine();
    System.out.println ("Enter the name of the farm dog.");
    dogname = in.nextLine();
    System.out.println ("Enter the breed of the farm dog.");
    dogbreed = in.nextLine();
    System.out.println ("Enter the number of sheep on the farm.");
    numsheep = Integer.parseInt(in.nextLine());
    in.close();
    //An array of sheep is created below
    Sheep[] sheep = new Sheep [numsheep];
    //The array will be initialized to random names and ages via a loop
    for (int i = 0; i < sheep.length; i++) 
      sheep[i] = new Sheep (getRandomName(), getRandomAge());
    Dog dog = new Dog (dogname, dogbreed);
    Farm farm = new Farm (farmname, dog, sheep);
    double wool = farm.getWool();
    System.out.println ("Your farm has " + numsheep + " sheep.");
    farm.printFarm();
    System.out.println ("We just sheared " + wool + " pounds of wool and earned $" + (wool * 1.45));
  }
}
