package java_code.danyuan09;

public class exe09 {
  public static void main(String[] args) {
    System.out.println();

    this_pro circle1 = new this_pro();
    circle1.output();

    this_pro circle2 = new this_pro(10,11);
    circle2.output();

  }
}

class this_pro{
  private int value;
  private double number;


  this_pro(int value,int number){
    this.value = value ;                                     //  this可以定位到成员变量，防止变量的重名
    this.number = number ;
  }

  this_pro(){
    this(0,1);                               //   this()可以调用类中另外的构造函方法，括号中填输入值
  }


  public void output(){
    System.out.println(value + "  "+ number);
  }

}




//                                          this   =>   1. 用于访问隐藏的成员变量    （  this .  ）

//                                                 =>   2. 调用类中另外的构造方法    （  this()  ）
