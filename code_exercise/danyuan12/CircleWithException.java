package java_code.danyuan12;

public class CircleWithException {

  private double radius;
  private static int numberOfObject = 0;                                       //  静态变量 => 归 类 所 有 (可以用来累加)

  public CircleWithException(){
    this(1.0);
  }

  public CircleWithException(double newRadius){
    setRadius(newRadius);
    numberOfObject++;
  }

  public double getRadius(){
    return this.radius;
  }

  public void setRadius(double newRadius) throws IllegalArgumentException{            //   输入为负数时，抛出IllegalArgumentException异常
    if(newRadius >= 0)
      radius = newRadius;
    else
      throw new IllegalArgumentException("Radius cannot be negative");
//      IllegalArgumentException ex = new IllegalArgumentException("Radius cannot be negative");            //  等价于这两行
//      throw ex;

  }

  public static int getNumberOfObject(){
    return numberOfObject;
  }

  public double findArea(){
    return radius*radius*3.14159;
  }

}




//                           IllegalArgumentException异常  ：   接 收 到 非 法 或 不 正 确 的 参 数