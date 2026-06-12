package java_code.danyuan03;

import java.util.Scanner;

public class exe03 {
  public static void main(String[] args) {               //      计算那年那月那日是这个星期的星期几 （Exercise03_21）

    Scanner input = new Scanner(System.in);
    System.out.println("Enter year:");
    int year = input.nextInt();

    System.out.println("Enter month : 1-12 :");
    int true_month = input.nextInt();

    System.out.println("Enter the day of the month : 1-31 :");
    int month_day = input.nextInt();

    int month = true_month;
    if (month == 1 || month == 2) {
      month += 12;
      year--;
    }


    int h = (month_day + (int) ((26 * (month + 1)) / 10) + (int) (year % 100) + (int) ((year % 100) / 4) + (int) ((year / 100) / 4) + 5 * ((int) (year / 100))) % 7;


    String week;
    switch (h) {
      case 0:
        week = "Saturday"; break;
      case 1:
        week = "Sunday";   break;
      case 2:
        week = "Monday";   break;
      case 3:
        week = "Tuesday";  break;
      case 4:
        week = "Wednesday";break;
      case 5:
        week = "Thursday"; break;
      default:
        week = "Friday";
    }

    System.out.println("Day of the week is " + week);
  }
}
