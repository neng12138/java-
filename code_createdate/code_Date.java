package code_createdate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class code_Date {
  public static void main(String[] args) {
    System.out.println();


    outputdate();

  }


  public static void outputdate() {                         //  输 出 一 个 当 前 的 精 确 时 间
    Date date = new Date();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年 MM月 dd日  HH:mm:ss");
    String str = sdf.format(date);

    System.out.println(str);

  }


  public static String createdate() {                         //  返 回 一 个 当 前 的 精 确 时 间  （ 返回一个字符串 ）
    Date date = new Date();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年 MM月 dd日  HH:mm:ss");
    String str = sdf.format(date);

    return str;

  }

}
