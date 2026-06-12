package java_code.danyuan11;

public class DynamicBindingDemo {
  public static void main(String[] args) {
    System.out.println();

    Object o = new Object();       // Object类 -- 所有人的爹
    output(o);


    o = new Person();
    output(o);


    o = new Student();
    output(o);


    o = new GraduateStudent();
    output(o);

  }

  public static void output(Object o){
    System.out.println(o.toString());
  }     // 多态

}



class Person extends Object{

  @Override
  public String toString(){
    return "Person";
  }

}


class Student extends Person{

  @Override
  public String toString(){
    return "Student";
  }

}


class GraduateStudent extends Student{
}





//                        1. 声明类型与实际类型一致：

//                                  调用一般方法 =>  1）  变量名 . 声明类型的方法()
//                                                 2）  变量名 . 声明类型的父类的方法()


//                                 调用重写方法 =>  变量名 . 重写方法()

//                                  //    先查看当前类是否有此方法，无则向上找其父类




//                        2.  声明类型为父类型，实际类型为子类型 ：

//                                     调用一般方法 =>  1）  变量名 . 声明类型的方法()
//                                                   2）  变量名 . 声明类型的父类的方法()
//                                                  3）   （（ 实际类型名 ）变量名 ） . 实际类型的方法()

//                                   //     实际类型为子类型时，不能直接调用实际类型的方法，要用转换记号 “  ( 实际类型名 )  ”


//                                    调用重写方法 =>  变量名 . 重写方法()

//                                  //     先看实际类型是否有此方法，无则再往上看实际类型的父类







