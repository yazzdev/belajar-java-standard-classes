package belajar.java.standard.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
  public static void main(String[] args) {

    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, 2020);
    calendar.set(Calendar.MONTH, Calendar.JANUARY);
    calendar.set(Calendar.DAY_OF_MONTH, 10);

    Date result = calendar.getTime();
    System.out.println(result);

  }
}
