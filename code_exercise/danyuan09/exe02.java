package java_code.danyuan09;

public class exe02 {
  public static void main(String[] args) {
    System.out.println();

    exe02 circle01 = new exe02();                                    //  直接一步声明class类的引用变量

    circle01.output();
//    circle01.alter(2);
//    circle01.output();
    int num1 = circle01.product(5);
    int num2 = circle01.add(5);
    System.out.println("The num1 is: "+num1);
    System.out.println("The num2 is: "+num2);


    System.out.println();


    exe02 circle02;                                                 //   声明class类的变量
    circle02 = new exe02(3);                                    //    引用对象

    circle02.output();
    double  num3 = circle02.product(5);
    double  num4 = circle02.add(5);
    System.out.println("The num3 is: "+num3);
    System.out.println("The num4 is: "+num4);

  }


  int value = 1;                                                //  数据域    （class类在主函数的类内）


  exe02(){                                                      //  构造方法 （构造函数）
  }

  exe02(int x){                                                 //  构造方法 （构造函数）
    value = x;
  }


  void output(){                                                //  成员方法 （成员函数）
    System.out.println(value);
  }

  void alter(int e){                                            //  成员方法 （成员函数）
    value = e;
  }

  int product(int num){                                         //  成员方法 （成员函数）
    int sum = 1;
    for (int i = 0; i < num; i++) {
      sum *= value;
    }
    return sum;
  }

  int add(int num){                                             //  成员方法 （成员函数）
    int sum = 0;
    for (int i = 0; i < num; i++) {
      sum += value;
    }
    return sum;
  }
}


//                                               实例化 ： 从一个类中创建实例的过程


//                                           实例成员： class类中的一些实例变量，常量和方法


//                                      指定（声明）一个class类的引用变量后， 用 “  . ” 去引用class类的各种实例成员

//                                             => 引用变量 ：  对象名 . 类中的变量名 ；

//                                             => 引用方法 ：  对象名 . 类中的方法名（） ；

