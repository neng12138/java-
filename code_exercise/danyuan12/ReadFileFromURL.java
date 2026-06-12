package java_code.danyuan12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
  public static void main(String[] args){
    System.out.println();

    System.out.print("Enter a URL: ");
    String URLString = new Scanner(System.in).next();                       //    输入一个网址

    //input定义在这里是方便在finally中进行关闭
    Scanner input = null;

    try {
      URL url = new URL(URLString);
      int count = 0;
      input = new Scanner(url.openStream());
      while (input.hasNext()) {
        String line = input.nextLine();
        count += line.length();
        System.out.println(line);
      }

      System.out.println("The file size is " + count + " characters");
    }
    catch (java.net.MalformedURLException ex) {
      System.out.println("Invalid URL--" + ex.getMessage());

    }
    catch (java.io.IOException ex) {
      System.out.println("IO Errors");
    }
    finally {
      input.close();       //  无论如何都要关闭，防止浪费资源
    }

  }
}
