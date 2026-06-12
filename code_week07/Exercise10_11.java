package code_week07;

public class Exercise10_11 {                                    //  圆类
  public static void main(String[] args) {
    System.out.println();

    Circle2D c1 = new Circle2D(2,2,5.5);        // 创建c1对象

    System.out.printf("The c1 Area is: %.3f%n",c1.getArea());
    System.out.printf("The c1 Perimeter is: %.3f%n",c1.getPerimeter());
    System.out.printf("%b%n",c1.contians(3,3));
    System.out.printf("%b%n",c1.contians(new Circle2D(4,5,10.5)));
    System.out.printf("%b%n",c1.overlaps(new Circle2D(3,5,2.3)));

    Circle2D yourcircle = new Circle2D();

  }
}



class Circle2D{
  private double x = 0;                    // 圆点的x坐标
  private double y = 0;                    // 圆点的y坐标
  private double radius = 1;               //  圆的半径

  static final double Pi = 3.1415;

  Circle2D(){
  }

  Circle2D(double x,double y,double radius){
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  double getRadius(){
    return radius;
  }

  double getX(){
    return x;
  }

  double getY(){
    return y;
  }

  double getArea(){                    //  返回圆的面积
    return (Pi*Math.pow(radius,2));
  }

  double getPerimeter(){               //  返回圆的周长
    return (Pi*2*radius);
  }


  boolean contians(double x,double y){             //  查看（x,y）是否在圆内
    int flag = 0;
    if(x>=this.x-radius && x<=this.x+radius ) flag++;
    if(y>=this.y-radius && x<=this.y+radius ) flag++;
    if(flag == 2) return true;
    else return false;
  }


  boolean contians(Circle2D circle){             //  查看圆circle是否在圆内

    double distance = Math.pow(circle.getX()-this.x,2)+Math.pow(circle.getY()-this.y,2);
    if(Math.sqrt(distance)+circle.getRadius() < this.radius) return true;
    else return false;
  }


  boolean overlaps(Circle2D circle){            //  查看圆circle是否与圆重叠

    double distance = Math.pow(circle.getX()-this.x,2)+Math.pow(circle.getY()-this.y,2);
    if(Math.sqrt(distance) < this.radius+circle.getRadius()) return true;
    else return false;
  }
}
