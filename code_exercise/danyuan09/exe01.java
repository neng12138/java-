package java_code.danyuan09;


public class exe01 {
  public static void main(String[] args) {
    System.out.println();

    circle mycircle01 = new circle();                                  //  直接一步声明class类的引用变量

    mycircle01.output();
//    mycircle01.alter(2);
//    mycircle01.output();
    double num1 = mycircle01.product(5);
    double num2 = mycircle01.add(5);
    System.out.println("The num1 is: "+num1);
    System.out.println("The num2 is: "+num2);


    System.out.println();


    circle mycircle02;                                                //   声明class类的变量
    mycircle02 = new circle(3);                                   //    引用对象

    mycircle02.output();
    double num3 = mycircle02.product(5);
    double num4 = mycircle02.add(5);
    System.out.println("The num3 is: "+num3);
    System.out.println("The num4 is: "+num4);

  }
}


class circle{                                //  circle类 在主函数的类外

  double value;                              //  数据域


  circle(){                                  //  构造方法 （构造函数）
    value = 1;
  }                    //  构造方法 （构造函数）

  circle(double x){                         //  构造方法 （构造函数）
    value = x;
  }            //  构造方法 （构造函数）



  void output(){                             //  成员方法 （成员函数）
    System.out.println(value);
  }

  void alter(double e){                      //  成员方法 （成员函数）
    value = e;
  }

  double product(int num){                   //  成员方法 （成员函数）
    double sum = 1;
    for (int i = 0; i < num; i++) {
      sum *= value;
    }
    return sum;
  }

  double add(int num){                       //  成员方法 （成员函数）
    double sum = 0;
    for (int i = 0; i < num; i++) {
      sum += value;
    }
    return sum;
  }

}




//                                               class类的主要部分:   1.数据域    2.构造方法   3.成员方法


//                                            构造方法 ： 1. 无返回类型     2.  方法名即为类名


//                                        声明（指定）class变量：   类名  变量名；


//                                  class变量引用对象：    变量名   =   new   类名（）；   =>  类名（） 就是class类的构造方法的引用

