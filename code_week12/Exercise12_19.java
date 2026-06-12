package code_week12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12_19 {
  public static void main(String[] args) throws IOException {
    System.out.println();

    File file = new File("Lincoln3.txt");     //  相 对 工 程 目 录 的 相 对 路 径

    Scanner input = new Scanner(file);
    int counts = 0;

    while (input.hasNext()){
      String s = input.next();

      int flag = 0;
      for (int i = 0; i < s.length(); i++) {
        if(Character.isLetter(s.charAt(i))) flag=1;
      }

      if (flag==1) counts++;
    }

    input.close();

    System.out.println(counts);
  }
}
