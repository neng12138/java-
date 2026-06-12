package java_code.danyuan12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData_try {
  public static void main(String[] args) throws IOException {
    System.out.println();


    //  Create a File instance
    File file = new File("scores.txt");       //  File类 定义的 对象file 指定一个文件路径


    try (
       //  Create a Scanner for the file
      Scanner input = new Scanner(file);
      )
    {
      //  Read data from a file
      while (input.hasNext()){                    //  input.hasNext()  =>  判断是否有输入的数据，只要有输入的数据就执行扫描和输出 （一直未关闭，不算死循环）

        String firstName = input.next();
        String mi = input.next();
        String lastName = input.next();
        int score = input.nextInt();

        System.out.println(firstName+" "+mi+" "+lastName+" "+score);
      }

    }

  }
}



//                            try( 定义和创建资源 ) { 执行程序; }    =>    自动关闭资源，不用手动close()方法