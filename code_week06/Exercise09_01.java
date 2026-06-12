package code_week06;

public class Exercise09_01 {
  public static void main(String[] args) {                                    //  类的基础使用
    System.out.println();


    Rectangle circle01 = new Rectangle(4,40);            //  定义类的对象并初始化
    circle01.output();

    double mianji01 = circle01.getArea();                                    //  调用类的成员方法
    System.out.printf("%-10.1f %n",mianji01);

    double tiji01 = circle01.getPerimeter();                                 //  调用类的成员方法
    System.out.printf("%-10.1f %n",tiji01);


    Rectangle circle02 = new Rectangle(3.5,35.9);      //  定义类的对象并初始化
    circle02.output();

    double mianji02 = circle02.getArea();                                   //  调用类的成员方法
    System.out.printf("%-10.1f %n",mianji02);

    double tiji02 = circle02.getPerimeter();                                //  调用类的成员方法
    System.out.printf("%-10.1f %n",tiji01);


  }
}

class Rectangle{
  double width = 1;                                                         //   数据域
  double heigth = 1;

  Rectangle(){                                                              //  无参构造方法
  }

  Rectangle(double width_true,double heigth_true){                         //  构造方法
    width = width_true;
    heigth = heigth_true;
  }

  void output(){                                                           // 成员方法
    System.out.printf("%-10.1f %n",width);
    System.out.printf("%-10.1f %n",heigth);
  }


  double getArea(){
    return (width*heigth);
  }                               // 成员方法

  double getPerimeter(){
    return ( (width+heigth)*2 );
  }                    // 成员方法
}

