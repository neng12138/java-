package java_code.danyuan07;

public class exe02 {
  public static void main(String[] args) {                          // java数组的函数调用
    System.out.println();

//    int[] arraya = {1,2,3,4,5};
    int[] arraya = new int[5];
    for(int i=0;i<5;i++) arraya[i] = i+1;                             // arraya:   1   2   3   4   5


    System.out.println("Before swap is: ");
    for(int x:arraya) System.out.print(x+"   ");                      // 输出数组的数据

    System.out.println('\n');


    System.out.println("After swap_one is: ");
    swap_one(arraya);
    for(int x:arraya) System.out.print(x+"   ");                       //  发现在函数中修改数组的地址值是不行的

    System.out.println('\n');


    System.out.println("After swap_two is: ");
    swap_two(arraya);
    for(int x:arraya) System.out.print(x+"   ");                       //  发现在函数中修改数组中数据是可以的（数组本身就是传地址值）

  }



  public static void swap_one(int[] arraya) {
    int[] arrayb = new int[arraya.length];

    for(int i=0;i<arraya.length;i++) arrayb[i] = arraya[arraya.length-1-i];

    arraya = arrayb;                                                         // 修改数组的地址值
  }



  public static void swap_two(int[] arraya) {
    int[] arrayb = new int[arraya.length];

    for(int i=0;i<arraya.length;i++) arrayb[i] = arraya[arraya.length-1-i];
    for(int j=0;j<arraya.length;j++) arraya[j] = arrayb[j];                               // 根据数组的地址修改数组内的数据

  }




  //                                   java数组的长度：   数组名.length     =>       直接返回数组的长度大小



}
