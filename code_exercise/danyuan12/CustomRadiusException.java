package java_code.danyuan12;



/*

自定义异常类可以额外提供功能，也可以没有任何额外方法，只是为了对应特定的异常，使得能够精确捕捉相应异常。
例如前面的设置半径的例子中，我们希望能捕获到不合法的半径值，并能半径值传给调用者进行后续处理，这种情况下，可以自定义异常：

*/


public class CustomRadiusException extends Exception {                          //   自 定 义 异 常
  private double radius;
  public CustomRadiusException(String message, double radius) {
    super(message);
    this.radius = radius;
  }
  public double getRadius() {
    return radius;
  }

}


///////////////////////////////////////////////////////////////////
class TestCustomRadiusException {
  public static void main(String[] args) {

    try {
      Circle c = new Circle(-5);
    } catch (CustomRadiusException e) {
      System.out.println(e.getMessage());
      System.out.println("你提供的半径值" + e.getRadius() + "有误");
    }

  }
}

class Circle {
  private double radius;

  public Circle() throws CustomRadiusException{
    this(1.0);
  }
  public Circle(double newRadius) throws CustomRadiusException {
    setRadius(newRadius);
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double newRadius)
    throws CustomRadiusException {
    if (newRadius >= 0)
      radius =  newRadius;
    else
      throw new CustomRadiusException("半径不能为负值",newRadius);
  }
}


