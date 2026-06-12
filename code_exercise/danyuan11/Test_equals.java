package java_code.danyuan11;

public class Test_equals {
  public static void main(String[] args) {
    System.out.println();

    Object circle1 = new Circle();
    Object circle2 = new Circle();

    System.out.println(circle1.equals(circle2));
  }
}

//class Circle{
//  double radius;
//
//  public boolean equals(Circle o){            //  重 载  ：  方 法 括 号 里 的 参 数 不 同
//    return this.radius == o.radius;
//  }
//
//}


class Circle{
  double radius;

  public boolean equals(Object o){              //   重 写  ：  方 法 体 不 一 样
    if(o instanceof Circle){
      return this.radius == ((Circle)o).radius;
    }
    else return this==o;
  }
}
