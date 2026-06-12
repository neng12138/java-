package code_week12;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercise12_15_three {
  public static void main(String[] args) throws IOException {
    System.out.println();

    //    System.out.println(System.getProperty("user.dir"));          //  工程目录
//    System.out.println(Exercise12_15.class.getResource("").getPath());           //  真正的类的相对路径

    File file = new File(Exercise12_15.class.getResource("").getPath()+"exercise12_15_one.txt");

    if (!file.exists()){
      BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file),512);   // 缓存区默认512B
      Random random = new Random();

      for (int i = 0; i < 100; i++) {
        int x = random.nextInt(100);

        output.write(x);
      }
      output.close();
    }
    else System.out.println("The file is created");

    BufferedInputStream input = new BufferedInputStream(new FileInputStream(file),512);    // 缓存区默认512B
    ArrayList<Integer> list = new ArrayList<>();

    while (input.available() != 0){
      list.add(input.read());
    }

    Collections.sort(list);
//    Collections.sort(list,Collections.reverseOrder());
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i)+" ");
    }

    input.close();

  }
}


//    二进制文件 ：

//               BufferedOutputStream  =>  write()              BufferedInputStream  =>   read()


//                只 比 FileInputStream 和 FileOutputStream 多 了 设 置 缓 冲 区 大 小 （ 构 造 方 法 ）
