package code_week05;

import java.util.Arrays;

public class Exercise08_04 {
  public static void main(String[] args) {
    System.out.println();

    int[][] week_hour = {                                                      //  java二维数组 也可以和 C++二维数组 一样在定义时直接赋值
      {2,4,3,4,5,8,8},{7,3,4,3,3,4,4},{3,3,4,3,3,2,2},{9,3,4,7,3,4,1},
      {3,5,4,3,6,3,8},{3,4,4,6,3,4,4},{3,7,4,8,3,8,4},{6,3,5,9,2,7,9} };


    int[] total = new int[week_hour.length];


    for (int i = 0; i < week_hour.length; i++) {
      for (int j = 0; j < week_hour[i].length; j++) {
        total[i] += week_hour[i][j];                                            // 将数组每行的数据分别加起来并存储在 数组total 中
      }
    }


    for (int i = 0; i < total.length; i++) {
      int max = total[i], num = i;                                              // 定义max为每行的总加数， num为总加数所代表的行数

      for (int j = 0; j < total.length; j++) {
        if(total[j] > max ) { max = total[j]; num = j; }
      }

      System.out.println("Employee"+num+"   "+max);                            // 每次输出最大值
      total[num] = -1;                                                          // 并将最大值赋值为-1
    }


  }
}
