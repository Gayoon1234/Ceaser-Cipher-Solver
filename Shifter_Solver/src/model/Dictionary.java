package model;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.HashSet;



public class Dictionary {

  private static HashSet<String> words = new HashSet<String>();
  public Dictionary(){
    try {
        File dict_file = new File("dictionary.txt");
        Scanner sc = new Scanner(dict_file);
        while (sc.hasNextLine()) {
          String data = sc.nextLine();
          words.add(data);
        }
        sc.close();
      } catch (FileNotFoundException e) {
        System.out.println("Invalid file");
        e.printStackTrace();
      }
  }

  public boolean isAWord(String s){
    return words.contains(s);
  }
}
