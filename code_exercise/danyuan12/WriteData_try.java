package java_code.danyuan12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData_try {
  public static void main(String[] args) throws IOException {
    System.out.println();

    File file = new File("scores.txt");              //   File类可以定义一个file对象，file对象指定文件路径

    if (file.exists()){                                      //   如果文件已经存在，就直接退出程序
      System.out.println("File already exists");
      System.exit(0);
    }


    try (
      //  Create a file
      PrintWriter output = new PrintWriter(file,"utf-8");           //  创 建 一 个 文 件 （ 无指明路径，都放在工程目录下，如：这里的20231003166_java
      )
    {

      //  Write formatted output to the file
      output.print("John T Smith ");
      output.println(92);
      output.print("Eric K Jones ");
      output.println(85);

      System.out.println("The "+file.getName()+" is finish");

    }

  }
}



//         try(  declare and create resources  ){    Use the resource to process the fil    }

//                 =>   小括号里必须写资源的声明和创建，可以在小括号中进行多个资源的声明和创建
//             （    资源必须是 AutoCloseable 接口（这个接口就一个close方法）的子类型，即其有关闭资源的方法，如：PrintWriter,Scanner   ）

//                 =>    大 括 号 里 写 对 文 件 执 行 的 程 序  （ 执行后会自动调用close()方法进行关闭资源 ）
