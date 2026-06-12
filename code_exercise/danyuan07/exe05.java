package java_code.danyuan07;

public class exe05 {
  public static void main(String[] args) {                   //  乐透号码

    int[] num = {11,22,33,44,55};
    output(num);

    output(1,2,3,4,5);                               //  可变长参数可以直接接收一些数值作为数组中的元素（接收数值更自由）

    output(new int[]{6,7,8,9,10});                         //  匿名数组

  }


  public static void output(int...  mon) {                  // 可变长参数（类似于一个数组）
    System.out.println('\n');

    for (int i = 0; i < mon.length; i++) {                  //  mon.length 可以看出可变长参数可以看成一个数组
      System.out.print(mon[i] + "  ");
    }

  }



  //                          可变长参数 => 数据类型...  数组名       （基本只用在函数的调用上，可以让java函数的传值更自由）


}
