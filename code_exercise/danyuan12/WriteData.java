package java_code.danyuan12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
  public static void main(String[] args) throws IOException {
    System.out.println();

    File file = new File("scores.txt");              //   File类可以定义一个file对象，file对象指定文件路径

    if (file.exists()){                                      //   如果文件已经存在，就直接退出程序
      System.out.println("File already exists");
      System.exit(1);
    }


    //  Create a file
    PrintWriter output = new PrintWriter(file,"utf-8");           //  创 建 一 个 文 件 （ 无指明路径，都放在工程目录下，如：这里的20231003166_java ）


    //  Write formatted output to the file
    output.print("John T Smith ");
    output.println(90);
    output.print("Eric K Jones ");
    output.println(85);


    System.out.println("The "+file.getName()+" is finish");
    //  Close the file
    output.close();                                            //  关 闭 文 件

  }
}




//            PrintWriter    :    将 内 容 写 入 文 件 中 （ 文件不存在就直接创建一个文件，否则直接覆盖文件里的内容 ）


//                 =>     1.  声明对象  ：  PrintWriter  对象名  =   new  PrintWriter( “文件路径” , "文件编码方式" )

//                =>     2.   写内容  ：   对象名 . print()/println()/printf()      （ 虚拟机会自动将输入的内容转为String ）

