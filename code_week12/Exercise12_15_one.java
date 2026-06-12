package code_week12;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercise12_15_one {
  public static void main(String[] args) throws IOException {
    System.out.println();

//    System.out.println(System.getProperty("user.dir"));          //  工程目录
//    System.out.println(Exercise12_15.class.getResource("").getPath());           //  真正的类的相对路径

    File file = new File(Exercise12_15.class.getResource("").getPath()+"exercise12_15_one.txt");

    if(!file.exists()){
      FileOutputStream output = new FileOutputStream(file,true);   // append ->  文本追加
      Random random = new Random();

      for (int i = 0; i < 100; i++) {
        int x = random.nextInt(100);
        output.write(x);
      }
      output.close();
    }
    else System.out.println("The file is created");


    FileInputStream input = new FileInputStream(file);
    ArrayList<Integer> list = new ArrayList<>();

    while (input.available() != 0){
      list.add(input.read());
    }

    Collections.sort(list,Collections.reverseOrder());
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i)+" ");
    }

    input.close();

  }
}

//    二进制文件 ：

//              FileOutputStream  =>  write()                FileInputStream  =>   read()


//              通 常 用 来 充 当 输 入 输 出 流  （传路径）
