package java_code.danyuan08;

public class exe02 {
  public static void main(String[] args) {
    System.out.println();

    int[][] mon ={
      {1,2,3,4,5},{1,2,3,4},{1,2,3},{1,2},{1}                   // 二维数组在定义时就赋值并且每行的数据个数不一样
    };

    int[] num = output(mon);                                    // 调用函数输出二维数组的数据

    System.out.println();
    for( int e:num ) System.out.print(e+"  ");                  //  输出每行的列数

  }


  public static int[] output(int[][] mon) {
    int[] mun = new int[mon.length];

    for (int i = 0; i < mon.length; i++) {
      for (int j = 0; j < mon[i].length; j++) {
        System.out.print(mon[i][j] + "  ");
      }
      mun[i] = mon[i].length;
      System.out.println();
    }

    return mun;                                                 // 返回一个存储每行有多少列数的数组

  }





  //                                   1.    java函数 可 以 返 回 数 组 类 型 的 返 回 值 （ c++ 不 行 ）



  //                                   2.    java函数 可 以 直 接 将 二 维 数 组 直 接 传 参 （ c++ 不 行 ）

  //                                            =>  二维数组函数  ：  数据类型   函数名（  数据类型[][]   数组名 ）

  //                                            =>   调用函数   ：   函数名（  二维数组的数组名  ）
}
