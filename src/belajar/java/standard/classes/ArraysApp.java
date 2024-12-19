package belajar.java.standard.classes;

import java.util.Arrays;

public class ArraysApp {
  public static void main(String[] args) {

    int[] numbers = {
            2, 34, 66, 77, 43, 23, 2, 24, 42, 1, 7, 6, 12, 33, 24
    };

    Arrays.sort(numbers);

    System.out.println(Arrays.toString(numbers));

    System.out.println(Arrays.binarySearch(numbers, 7));
    System.out.println(Arrays.binarySearch(numbers, 24));
    System.out.println(Arrays.binarySearch(numbers, 100));

    int[] result = Arrays.copyOf(numbers, 5);
    System.out.println(Arrays.toString(result));

    int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
    System.out.println(Arrays.toString(result2));

  }
}
