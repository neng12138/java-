package java_code.danyuan10;

public class exe02 {
  public static void main(String[] args) {
    System.out.println();

    StringBuilder str = new StringBuilder();

    str.append("Welcome");
    str.append(" ");
    str.append("to");
    str.append(" ");
    str.append("java");

    str.reverse();                  //    StringBuilder类的倒置方法

    System.out.println(str);
  }
}





//                               StringBuilder类  ：  可 变 长 字 符 串

//                                           =>  构造方法 ： StringBuilder   对象名  =  new   StringBuilder() ;

//                                           =>  StringBuilder类 自带一些修改字符串的方法，如：append , insert , delete , reverse , repalace



//                                String类  ：  不 可 变 长 字 符 串