package code_week12;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercise12_15_two {
  public static void main(String[] args) throws IOException {
    System.out.println();

    //    System.out.println(System.getProperty("user.dir"));          //  工程目录
//    System.out.println(Exercise12_15.class.getResource("").getPath());           //  真正的类的相对路径

    File file = new File(Exercise12_15.class.getResource("").getPath()+"exercise12_15_two.txt");

    if (!file.exists()){
      DataOutputStream output = new DataOutputStream(new FileOutputStream(file,true));
      Random random = new Random();

      for (int i = 0; i < 100; i++) {
        int x = random.nextInt(100);

        output.writeInt(x);
      }
      output.close();
    }
    else System.out.println("The file is created");

    DataInputStream input = new DataInputStream(new FileInputStream(file));
    ArrayList<Integer> list = new ArrayList<>();

    while (input.available() != 0){
      list.add(input.readInt());
    }

    Collections.sort(list,Collections.reverseOrder());
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i)+" ");
    }

    input.close();

  }
}


//     二进制文件：

//             DataOutputStream  =>  writeType()                DataInputStream   =>  readType()


//              可 以 通 过 数 据 类 型 进 行 写 文 件 和 读 文 件 ，读 写 的 精 准 度 会 更 高

