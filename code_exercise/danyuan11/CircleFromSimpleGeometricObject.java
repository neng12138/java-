package java_code.danyuan11;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{                    //   圆
  private double radius;


  public CircleFromSimpleGeometricObject(){
  }

  public CircleFromSimpleGeometricObject(double radius){
    this.radius = radius;
  }

  public CircleFromSimpleGeometricObject(double radius,String color,boolean filled){
    super(color, filled);    //  调用父类的构造方法
    this.radius = radius;
  }


  public double getRadius(){
    return radius;
  }
  public void setRadius(double radius){
    this.radius = radius;
  }


  public double getArea(){
    return radius*radius*Math.PI;
  }

  public double getDiameter(){
    return 2*radius;
  }

  public double getPerimeter(){
    return 2*radius*Math.PI;
  }


//  重写toString方法
  public String toString(){
    return super.toString()+"The radius is "+radius+"\nThe circle Area is "+getArea()+"\nThe circle Perimeter is "+getPerimeter()+'\n';
  }

}
