package java_code.danyuan13;

import java.util.ArrayList;

public class TestClone01 {
  public static void main(String[] args) {
    System.out.println();

    ArrayList<Double> list1 = new ArrayList<>();
    list1.add(1.5);
    list1.add(2.5);
    list1.add(3.5);

    ArrayList<Double> list2 = (ArrayList<Double>) list1.clone();                   //   clone() 复制副本
    ArrayList<Double> list3 = list1;                                              //   复制地址

    list2.add(4.5);
    list3.remove(2.5);
    System.out.println("The list1 is "+list1);         //  The list1 is [1.5, 3.5]
    System.out.println("The list2 is "+list2);        //   The list2 is [1.5, 2.5, 3.5, 4.5]
    System.out.println("The list3 is "+list3);       //   The list3 is [1.5, 3.5]


    System.out.println();


    int[] list4 = {1,2};
    int[] list5 = list4.clone();                                                 //   clone()   复制副本

    list4[0] = 7;
    list5[1] = 8;
    System.out.println("The list4 is "+list4[0]+","+list4[1]);
    System.out.println("The list5 is "+list5[0]+","+list5[1]);

  }
}





//                              clone()方法  =>   基 本 的 数 据 类 型 和 包 装 类 都 可 以 直 接 使 用 （ 内 带 方 法 ）

//                                          =>   包 装 类 使 用 时 要 用 强制类型转换   ‘（ 类名 ）’