package java_code.danyuan09;

import java.util.Scanner;

public class exe07 {
  public static void main(String[] args) {
    System.out.println();

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the num: ");
    int num = input.nextInt();


    arrays[] circle = new arrays[num];                   //  定义类的数组 同时 默认将数组的每个元素都定义为类的对象
    for (int i = 0; i < num; i++) {

      circle[i] = new arrays();                         //   类的数组 中的每个数组元素仍然要引用对象 才可以使用类中的实例成员

      circle[i].output();

    }

  }
}



class arrays{
  int value = 10;                                       //  数据域
  int number = 5;

  arrays(){                                             //  无参构造方法
  }

  arrays(int v,int n){                                  //  构造方法
    value = v;
    number = n;
  }

  void output(){                                        // 成员方法
    System.out.println(value+"  "+number);
  }

}



//                                   类的定义  ：    类名   变量名   =   new   类名（）  ;


//                                  类的数组  ：     类名[]   变量名   =    new    类名[   数组的长度   ] ;


//                                          =>   数组元素要使用类中的实例成员仍然要引用对象  （   new  类名() ;   ）



