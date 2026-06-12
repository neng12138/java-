package java_code.danyuan06;

public class exe02 {
  public static void main(String[] args) {                    //  java的 格式化输出（printf）
    System.out.println();

    System.out.printf("整数：\t %-10d %d %n%n",123,456);

    System.out.printf("浮点数： %-10.2f %.3f %n%n",3.1415926,3.1415926);

    System.out.printf("字符串: %-10s %s %n%n","abc","bcd");

    System.out.printf("单个字符： %-10c %c ",'a','b');


  }



  //               printf:           转换符 :  1.%d => 十进制整数   2.%f => 十进制浮点数   3.%s => 字符串

  //                                          3.%c => 单个字符    5.%n => 换行（ 类似于\n ）


  //                                  printf格式： %  -  m.n  格式字符

  //                                         1. % => 格式说明的起始符号     2. - => 有“-”表示向左对齐输出，省略表示向右对齐输出

  //                                        3. m.n => m->域宽，即所占总字符数      n->精度，即保留n位小数

  //                                        4。 格式字符 => 比如：d,f,s,c等





}
