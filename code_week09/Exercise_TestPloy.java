package code_week09;

public class Exercise_TestPloy {
  public static void main(String[] args) {
    System.out.println();

    printArea(new GeometricObject());
    printArea(new Circle(3));
    printArea(new Rectangle(4,5));
    printArea(new Triangle(5,12,13));
  }

  public static void printArea(GeometricObject g) {
    g.getArea();
  }

}


class GeometricObject {

//   GeometricObject(){}

  public void getArea() {
    System.out.println("得到几何体的面积");
  }
}

class Circle extends GeometricObject {                         //  圆
  private double radius;

  Circle(){}

  Circle(double radius){
    this.radius = radius;
  }

  double getRadius(){return radius;}
  void setRadius(double radius){this.radius = radius;}

  double getarea(){
    return Math.pow(radius,2)*Math.PI;
  }

  public void getArea() {
    System.out.printf("圆的面积是 %.1f%n",getarea());
  }
}


class Rectangle extends GeometricObject {                       //  矩形
  private double height;
  private double width;

  Rectangle(){}

  Rectangle(double height,double width){
    this.height = height;
    this.width = width;
  }

  double getHeight(){return height;}
  double getWidth(){return width;}
  void setHeight(double height){ this.height = height;}
  void setWidth(double width){ this.width = width;}

  double getarea(){
    return height*width;
  }

  public void getArea() {
    System.out.println("矩形的面积是 "+getarea());
  }
}



class Triangle extends GeometricObject{                       //  三角形
  private double side1;
  private double side2;
  private double side3;

  Triangle(){}

  Triangle(double side1,double side2,double side3){
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  double getSide1(){
    return side1;
  }
  double getSide2(){
    return side2;
  }
  double getSide3(){
    return side3;
  }
  void setSide1(double side1){this.side1 = side1;}
  void setSide2(double side2){this.side2 = side2;}
  void setSide3(double side3){this.side3 = side3;}


  double getarea(){
    double s = (side1 + side2 + side3)/2;
    double cut = s*(s-side1)*(s-side2)*(s-side3);
    return Math.sqrt(cut);
  }

  public void getArea() {
    System.out.println("三角形的面积是 "+getarea());
  }

}