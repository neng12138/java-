package java_code.danyuan09;

public class exe03 {
  public static void main(String[] args) {
    System.out.println();

    mycircle circle1 = new mycircle(5);
//    circle1.output();
    circle1.add();
    System.out.print("The value is: ");

    circle1.output();                                          //  实例方法 ： 归某个类的对象独有（ 用 “对象名.” 引用实例方法 ）

    circle1.add_static();
    System.out.print("The value_static is: ");

    mycircle.output_static();                                 //  静态方法 ： 全体对象可共用 （ 可以直接用 “类名.” 引用静态方法）


    System.out.println();


    mycircle circle2 = new mycircle(5);
//    circle2.output();
    circle2.add();
    System.out.print("The value is: ");

    circle2.output();                                        //  实例方法 ： 归某个类的对象独有（ 用 “对象名.” 引用实例方法 ）

    circle2.add_static();
    System.out.print("The value_static is: ");

    mycircle.output_static();                                //   静态方法 : 全体对象可共用 （ 可以直接用 “类名.” 引用静态方法）

  }
}


class mycircle{

  int value = 1;                                             //  实例变量 ： 某个对象独有

  static int value_static = 10;                             //  静态变量 ： 全体共享

  mycircle(){
  }

  mycircle(int x){
    value = x;
  }


  void add_static(){
    value_static++;
  }

  void add(){
    value++;
  }

  void output(){
    System.out.println(value);
  }


  static void output_static(){
    System.out.println(value_static);
  }
}





//                              1.      static  ：  修饰静态变量，常量和方法  （静态 => 全体共同使用 ）

//                                    =>  static   数据类型   变量名；

//                                    =>  static   数据类型   方法名（）
//                                      {            方法体；              }




//                             2.    实例变量，常量和方法  ：  类的某个对象独有

//                                                =>   只能用 “ 对象名 . ” 引用  (独享)



//                            3.     静态变量，常量和方法  ：  归类所有

//                                                =>   可以用 “ 对象名 . ” 引用

//                                                =>   还可以用  “ 类名 . ”  直接引用  (共用)




//                           实例 =>  归某个对象所有，只能由对象引用

//                           静态 => 归类所有，能由对象和类引用

