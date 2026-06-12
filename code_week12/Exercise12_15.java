package code_week12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Exercise12_15 {
  public static void main(String[] args) throws IOException {
    System.out.println();

//    System.out.println(System.getProperty("user.dir"));          //  工程目录
//    System.out.println(Exercise12_15.class.getResource("").getPath());           //  真正的类的相对路径

    File file = new File(Exercise12_15.class.getResource("").getPath()+"exercise12_15.txt");
    if (!file.exists()){
      PrintWriter output = new PrintWriter(file);
      Random random = new Random();

      for (int i = 0; i < 100; i++) {
        int x = random.nextInt(100);
        output.print(x+" ");
      }
      output.close();
    }
    else System.out.println("The file is created");


    Scanner input = new Scanner(file);
    ArrayList<Integer> list = new ArrayList<>();

    while (input.hasNext()){
      list.add(input.nextInt());
    }
    Collections.sort(list,Collections.reverseOrder());
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i)+" ");
    }

    input.close();

  }
}


//      文本文件：

//           PrintWriter =>   print/println/printf                  Scanner  =>  nextType()

