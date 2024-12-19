package belajar.java.standard.classes;

public class StringBuilderApp {
  public static void main(String[] args) {
    StringBuilder builder = new StringBuilder();

    builder.append("Dyaz");
    builder.append(" ");
    builder.append("Amrullah");

    String name = builder.toString();
    System.out.println(name);
  }
}
