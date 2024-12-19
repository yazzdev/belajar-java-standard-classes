package belajar.java.standard.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
  public static void main(String[] args) {

    String value = "Dyaz Amrullah Sedang Belajar Java Standard Classes";

    StringTokenizer tokenizer = new StringTokenizer(value, " ");

    while(tokenizer.hasMoreTokens()){

      String result = tokenizer.nextToken();

      System.out.println(result);
    }
  }
}
