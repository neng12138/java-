package java_code.danyuan13;

import java.util.Arrays;

public class TestComparableRectangle {
  public static void main(String[] args) {
    System.out.println();

    Rectangle[] demo = {new ComparableRectangle(12,5),new ComparableRectangle(5,4)};
    System.out.println("Before the sort:");
    show(demo);

    Arrays.sort(demo);                                       //  只要在类中重写Comparable<E>接口方法，就可以用Arrays.sort() 进行数组的排序

    System.out.println("After the sort:");
    show(demo);
  }


  public static void show(Rectangle[] demo) {
    for ( Rectangle o : demo){
      System.out.println(o.toString());
    }
    System.out.println();
  }

}


class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{

  ComparableRectangle(double side1,double side2){
    super(side1, side2);
  }

//  public int compareTo(ComparableRectangle o){                         //     降 序   （  排 序 方 式 自 己 定  ）
//    if(getArea() > o.getArea()) return -1;
//    else if (getArea() < o.getArea()) return 1;
//    else return 0;
//  }

  public int compareTo(ComparableRectangle o){                       //     升 序   （  默 认 形 式  ）
    if(getArea() > o.getArea()) return 1;
    else if (getArea() < o.getArea()) return -1;
    else return 0;
  }


  public String toString(){
    return super.toString()+"The Rectangle Area is "+getArea()+"cm^2";
  }
}


class Rectangle{
  private double Width,Height;

  Rectangle(){}

  Rectangle(double side1,double side2){
    this.Width = side1;
    this.Height = side2;
  }

  double getWidth(){ return Width;}
  double getHeight(){ return Height;}
  void setWidth(double side1){ this.Width = side1;}
  void setHeight(double side2){ this.Height = side2;}

  double getArea(){
    return Width*Height;
  }

  public String toString(){
    return "The Rectangle Width is "+Width+"cm and Height is "+Height+"cm\n";
  }

}



//             1.    public  String toString()        =>     方 法 （  重 写  ）


//            2.    public boolean equals(Object o)      =>      方 法 （  重 写  ）


//           3.    public  interface Comparable<E> {           =>    接 口  （  实 现 抽 象 方 法  ）
//                     public abstract int compareTo(E o);
//               }



