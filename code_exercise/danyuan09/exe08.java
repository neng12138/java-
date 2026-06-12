package java_code.danyuan09;

public class exe08 {
  public static void main(String[] args) {
    System.out.println();

    count circle = new count();                                  //  实例化
    circle.output();

//    circle.value = 2;                                         //  private变量只能在定义的类中引用


//    circle.setValue(2);                                       //  parivate方法只能在定义的类中引用
    circle.setNumber(2);
    circle.output();

  }
}

class count{
  private int value = 1;
  private int number = 1;

  count(){
  }

  private void setValue(int a){
    value = a;
  }

  void setNumber(int num){                                     // 虽然number是private的，但仍然可以通过方法改变number的值
    number = num;
  }

   public void output(){
    System.out.println(value+"  "+number);
  }

}





//                                          public  =>  可 以 在 任 何 包 中 引 用

//                                       private  =>  只 能 在 定 义 的 类 中 引 用

//                                   default（省略）  =>   只 能 在 同 一 个 包（ package ） 中 引 用
