package java_code.danyuan12;

import java.io.File;

public class TestFileClass {
  public static void main(String[] args) {
    System.out.println();


    //默认情况下，java.io 包中的类总是根据当前用户目录来分析相对路径名。此目录由系统属性 user.dir 指定
    System.out.println(System.getProperty("user.dir"));


    File file = new File("image/us.gif");

    //   判 断 文 件 是 否 存 在
    System.out.println("Does it exist? "+file.exists());


    System.out.println("The file has "+file.length()+" bytes");

    System.out.println("Can it be read? "+file.canRead());

    System.out.println("Is it a directory? "+file.isDirectory());

    System.out.println("Is it a file? "+file.isFile());

    System.out.println("Is it absolute? "+file.isAbsolute());

    System.out.println("Is it hidden? "+file.isHidden());


    //   返 回 一 个 文 件 的 相 对 路 径
    System.out.println("path is "+file.getPath());

    //   返 回 一 个 文 件 的 绝 对 路 径
    System.out.println("Absolute path is "+file.getAbsolutePath());


    System.out.println("Last modified on "+new java.util.Date(file.lastModified()));

  }
}



//           File   file   =    new  File( "文件路径" )

//                  =>   File类 的 file对象 直接指定此文件路径


