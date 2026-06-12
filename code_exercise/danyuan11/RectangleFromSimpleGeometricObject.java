package java_code.danyuan11;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {                //  矩 形
  private double width;
  private double height;


  public RectangleFromSimpleGeometricObject(){
  }

  public RectangleFromSimpleGeometricObject(double width,double height){
    this.width = width;
    this.height = height;
  }

  public RectangleFromSimpleGeometricObject(double width,double height,String color,boolean filled){
    super(color, filled);       // 调用父类的构造方法
    this.width = width;
    this.height = height;
  }


  public double getWidth(){
    return width;
  }
  public void setWidth(double width){
    this.width = width;
  }


  public double getHeight(){
    return height;
  }
  public void setHeight(double height){
    this.height = height;
  }


  public double getArea(){
    return width*height;
  }

  public double getPerimeter(){
    return (width+height)*2;
  }


  //   重写toString方法
  public String toString(){
    return super.toString()+"The rectangle width is "+width+" and height is "+height+"\nThe rectangle Area is "+getArea()+"\nThe rectangle " +
      "Perimeter is "+getPerimeter()+'\n';
  }

}
