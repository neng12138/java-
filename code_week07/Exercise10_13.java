package code_week07;

public class Exercise10_13 {                        //  矩形类
  public static void main(String[] args) {
    System.out.println();

    MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);
    System.out.printf("The r1 Areac is: %.1f%n",r1.getPAreac());
    System.out.printf("The r1 Perimeter is: %.1f%n",r1.getPerimeter());

    System.out.printf("%b%n",r1.contains(3,3));
    System.out.printf("%b%n",r1.contains(new MyRectangle2D(4,5,5.3,3.2)));
    System.out.printf("%b%n",r1.overlaps(new MyRectangle2D(3,5,2.3,5.4)));
  }
}

class MyRectangle2D{
  private double x = 0;
  private double y = 0;
  private double width = 1;
  private double height = 1;

  MyRectangle2D(){
  }

  MyRectangle2D(double x,double y,double width,double height){
    this.x = x; this.y = y;
    this.width = width;  this.height = height;
  }

  double getX(){
    return x;
  }

  double getY(){
    return y;
  }

  double getWidth(){
    return width;
  }

  double getHeight(){
    return height;
  }

  void setWidth(double width){
    this.width = width;
  }

  void setHeight(double height){
    this.height = height;
  }

  void setX(double x){
    this.x = x;
  }

  void setY(double y){
    this.y = y;
  }

  double getPerimeter(){              // 求矩形的周长
    return ((width+height)*2);
  }

  double getPAreac(){                 //  求矩形的面积
    return (width*height);
  }


  boolean contains(double x,double y){       //  查询某点是否在矩形内
    int flag = 0;
    if(x >= this.x-this.width/2 && x<= this.x+this.width/2) flag++;
    if(y >= this.y-this.height/2 && y<= this.y+this.height/2) flag++;
    if(flag == 2 ) return true;
    else return false;
  }


  boolean contains(MyRectangle2D r){         // 查询矩形r是否在矩形内
    int flag = 0;
    if(Math.abs(this.x-r.getX()) + r.getWidth()/2 <this.width/2 ) flag++;
    if( Math.abs(this.y-r.getY()) + r.getHeight()/2 <this.height/2 ) flag++;
    if(flag == 2 ) return true;
    else return false;
  }


  boolean overlaps(MyRectangle2D r){        // 查询矩形r是否与矩形重叠
    int flag = 0;
    if(Math.abs(this.x-r.getX())<this.width/2 + r.getWidth()/2 ) flag++;
    if( Math.abs(this.y-r.getY())<this.height/2 +r.getHeight()/2 ) flag++;
    if(flag == 2 ) return true;
    else return false;
  }

}
