package code_week06;

public class Exercise09_08 {
  public static void main(String[] args) {
    System.out.println();

    Fan mycircle = new Fan();                                           //  调用类的成员方法并进行初始化
    mycircle.alter_all(mycircle.fast,true,10,"yellow");

    String str1 = mycircle.ToString();
    System.out.println("The first fan is: "+'\n'+str1+'\n');



    Fan yourcircle = new Fan();                                        //  调用类的成员方法并进行初始化
    yourcircle.alter_speed(yourcircle.medius);

    String str2 = yourcircle.ToString();
    System.out.println("The second fan is: "+'\n'+str2);


  }
}


class Fan {
  int slow = 1;
  int medius = 2;
  int fast = 3;
  private int speed = slow;                                               //  示 风 扇 的 速 度
  private boolean on = false;                                             //  示 风 扇 是 否 打 开
  private double radius = 5;                                              //  风 扇 的 半 径
  private String color = "blue";                                          //  风 扇 的 颜 色


  Fan() {                                                                // 无参构造方法
  }


  void output_speed() {
    System.out.println("The Fan speed is: " + speed);
  }

  void output_on() {
    System.out.println("The Fan on is: " + on);
  }

  void output_radius() {
    System.out.println("The Fan radius is: " + radius);
  }

  void output_color() {
    System.out.println("The Fan color is: " + color);
  }


  void alter_speed(int s) {
    speed = s;
  }

  void alter_on(boolean o) {
    on = o;
  }

  void alter_radius(double r) {
    radius = r;
  }

  void alter_color(String c) {
    color = c;
  }


  void alter_all(int s,boolean o,double r,String c){
    speed = s;
    on = o;
    radius = r;
    color = c;
  }


  String ToString() {                                       //  返回描述风扇的宇符串

    if (on == true) {
      String str1 = "fan is on; " + "speed is " + speed + "; color is " + color + "; radius is " + radius;
      return str1;
    }
    else{
      String str2 = "fan is off; " + "color is " + color + "; radius is " + radius;
      return str2;
    }

  }


}





