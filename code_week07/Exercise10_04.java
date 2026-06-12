package code_week07;

public class Exercise10_04 {                                 // 坐标点的问题
  public static void main(String[] args) {
    System.out.println();

    MyPoint c1 = new MyPoint();
    MyPoint c2 = new MyPoint(10,30.5);

    System.out.printf("The first distance is:   %.3f%n",c2.distance());
    System.out.printf("The second distance is:  %.3f%n",c2.distance(c1));
    System.out.printf("The third distance is:   %.3f%n",MyPoint.distance(c1,c2));

  }
}



class MyPoint{
  private double x=0;
  private double y=0;

  MyPoint(){
  }

  MyPoint(double x,double y){
    this.x = x;
    this.y = y;
  }

  double getX(){
    return x;
  }

  double getY(){
    return y;
  }

  double distance(){
    // 返回从该点到 MyPoint 类型的指定点之间的距离
    double e = Math.pow(x,2)+Math.pow(y,2);
    return (Math.sqrt(e));
  }

  double distance(MyPoint circle){
    // 返回从该点到指定 x 和y 坐标的指定点之间的距离
    double e = Math.pow(x-circle.getX(),2)+Math.pow(y-circle.getY(),2);
    return (Math.sqrt(e));
  }

  static double distance(MyPoint c1,MyPoint c2){
    // 返回求任何两点间的距离
    double e = Math.pow(c1.getX()-c2.getX(),2)+Math.pow(c1.getY()-c2.getY(),2);
    return (Math.sqrt(e));
  }
}

