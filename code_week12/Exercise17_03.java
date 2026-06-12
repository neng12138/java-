package code_week12;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercise17_03 {
  public static void main(String[] args) throws IOException {
    System.out.println();

    //    System.out.println(System.getProperty("user.dir"));          //  工程目录
//    System.out.println(Exercise12_15.class.getResource("").getPath());           //  真正的类的相对路径

    File file = new File(Exercise17_03.class.getResource("").getPath()+"exercise17_03.dat");

    if (!file.exists()){
      DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file,true),512));
      Random random = new Random();

      for (int i = 0; i < 100; i++) {
        int x = random.nextInt(100);

        output.writeInt(x);
      }
      output.close();
    }
    else System.out.println("The file is created");

    DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file),512));

    int sum = 0;
    while (input.available() != 0){
      sum += input.readInt();
    }

    input.close();

    System.out.println(sum);
  }
}
