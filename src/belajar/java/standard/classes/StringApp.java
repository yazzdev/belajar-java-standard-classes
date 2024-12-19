package belajar.java.standard.classes;

public class StringApp {
  public static void main(String[] args) {

    String name = "Dyaz Amrullah";
    String nameLowercase = name.toLowerCase();
    String nameUppercase = name.toUpperCase();

    System.out.println(name);
    System.out.println(nameLowercase);
    System.out.println(nameUppercase);

    //Hitung panjang karakter
    System.out.println(name.length());
    //Cek apakah dimulai/diakhiri dengan
    System.out.println(name.startsWith("Dyaz"));
    System.out.println(name.endsWith("Amrullah"));

    //Memisahkan dengan string spasi
    String[] names = name.split(" ");
    for (var value : names) {
      System.out.println(value);
    }

    System.out.println(" ".isBlank());
    System.out.println(" ".isEmpty());
    System.out.println("".isEmpty());
    System.out.println(name.charAt(0));

    char[] chars = name.toCharArray();
  }
}
