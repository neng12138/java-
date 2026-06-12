package code_week08;

import java.util.Scanner;

public class Exercise11_01 {
  public static void main(String[] args) {
    System.out.println();


    Scanner input = new Scanner(System.in);
    System.out.print("Enter the color is :");
    String color = input.next();

    System.out.print("Enter the three side is :");
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();

    System.out.print("Enter the filled is :");
    boolean filled = input.nextBoolean();

    System.out.println();

    GeometricObject mycircle = new Triangle(side1,side2,side3,color,filled);

    output(mycircle);


  }

  public static void output(GeometricObject g){
    System.out.println(g.toString());
  }

}


class GeometricObject{
  private String color;
  private boolean filled;


  GeometricObject(){}

  GeometricObject(String color,boolean filled){
    this.color = color;
    this.filled = filled;
  }


  String getColor(){return color;}
  boolean isFilled(){return filled;}

  void setColor(String color){
    this.color = color;
  }
  void setFilled(boolean filled){
    this.filled = filled;
  }


  public String toString(){
    return "Triangle: color = "+color+"\nTriangle: filled = "+filled+'\n';
  }

}



class Triangle extends GeometricObject{
  private double side1 = 1;
  private double side2 = 1;
  private double side3 = 1;


  Triangle(){}

  Triangle(double side1,double side2,double side3){
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  Triangle(double side1,double side2,double side3,String color,boolean filled){
    super(color, filled);
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


  double getArea(){
    double s = (side1 + side2 + side3)/2;
    double cut = s*(s-side1)*(s-side2)*(s-side3);
    return Math.sqrt(cut);
  }

  double getPerimeter(){
    return (side1+side2+side3);
  }


  public String toString(){
    return super.toString()+"Triangle: side1 = "+side1+"  side2 = "+side2+"  side3 = "+side3+"\nThe triangle Area is "+getArea()+"\nThe triangle " +
      "Perimeter is "+getPerimeter()+'\n';
  }

}
