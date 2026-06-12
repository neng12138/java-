package java_code.danyuan11;

public class TestCircleRectangle {
  public static void main(String[] args) {
    System.out.println();

    SimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1,"blue",true);
    output(circle);


    System.out.println();


    SimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2,3,"red",false);
    output(rectangle);

  }


  public static void output(SimpleGeometricObject s){                   //  多态 （ 动 态 绑 定 ）
    System.out.println(s.toString());
  }

}



//               1. 子 类 继 承 父 类：    （  extends  ）


//                              class   子类名   extends   父类名

//                         {                   类体；                   }



//              2.   关键字 super ：

//                              =>  调 用 父 类 的 构 造 函 数     (   super(  )   )

//                              =>  调 用 父 类 的 成 员 函 数    (   super.父类方法名()   )