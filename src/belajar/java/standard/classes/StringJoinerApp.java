package belajar.java.standard.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
  public static void main(String[] args) {
    StringJoiner joiner = new StringJoiner(", ", "{", "}");

    joiner.add("Dyaz");
    joiner.add("Amrullah");
    joiner.add("Sinta");
    joiner.add("Sintiani");

    String value = joiner.toString();
    System.out.println(value);
  }
}
