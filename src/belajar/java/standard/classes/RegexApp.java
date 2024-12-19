package belajar.java.standard.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
  public static void main(String[] args) {

    String name = "Dyaz Amrullah Back End Java Developer";

    Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
    Matcher matcher = pattern.matcher(name);

    while (matcher.find()) {
      String result = matcher.group();
      System.out.println(result);
    }
  }
}
