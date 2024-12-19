package belajar.java.standard.classes;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64App {
  public static void main(String[] args) {

    String original = "Dyaz Amrullah";

    String encoded = Base64.getEncoder().encodeToString(original.getBytes(StandardCharsets.UTF_8));
    System.out.println(encoded);

    byte[] decoded = Base64.getDecoder().decode(encoded);
    String result = new String(decoded);

    System.out.println(result);
  }
}
