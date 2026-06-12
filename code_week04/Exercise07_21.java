package code_week04;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_21 {
  public static void main(String[] args) {

    System.out.print("Enter the number of balls to drop: ");
    Scanner input = new Scanner(System.in);
    int balls_num = input.nextInt();                                       // 输入滚下的小球的总数


    System.out.print("Enter the number of slots in the bean machine: ");
    int slots_num = input.nextInt();                                        // 输入总共有多少个槽位
    System.out.println();


    int[] slot_ball_num = new int[slots_num];                              // 定义一个数组slot_ball_num 记录每个槽位中存在的小球的个数

    Arrays.fill(slot_ball_num,0);                                      // 一开始每个槽位中的小球数都是0个


    slot_ball(slot_ball_num,balls_num,slots_num);


    int max = find_max(slot_ball_num);

    output(slot_ball_num,max);



//    int[][] array = new int[max][slots_num];                               // 记录一个二维数组进行纵向输出（行数：最多的小球数  ， 列数：槽位数）
//    for(int i=0;i<max;i++){
//      for(int j=0;j<slots_num;j++){
//        array[i][j]=1;                                                     // 一开始全部值都赋为1 （0表示有球）
//      }
//    }
//
//
//    for(int i=0;i<slots_num;i++){
//      if(slot_ball_num[i]==0) continue;
//      else{
//        for(int j=0;j<slot_ball_num[i];j++){
//          array[max-1-j][i] =0;                                             // 将每个槽位中拥有的小球数赋给二维数组中的对应的位置
//        }
//      }
//    }
//
//
//
//    for(int i=0;i<max;i++){                                                // 将二维数组中的数据进行输出
//      for(int j=0;j<slots_num;j++){
//        if(array[i][j]==0) System.out.print(0);
//        else System.out.print(" ");                                        // 如果数据为1，就输出空格
//      }
//      System.out.println();                                                // 每输出一行就换行
//    }


  }


  public static void slot_ball(int[] a,int balls_num,int slots_num) {

    for(int i=0;i<balls_num;i++){

      int num=0;                                                           // 定义num 表示小球向右滚动的次数（‘R’）
      for(int j=1;j<slots_num;j++){
        int ran = (int)(Math.random()*2);                                  // 类比50%概论
        if(ran == 1) {num++; System.out.print("R");}                       // 如果结果是1表示小球向右滚，如果结果是0表示小球向左滚
        else System.out.print("L");
      }

      System.out.println();
      a[num]+=1;                                               // 记录小球滚到的槽位，槽位中的小球数加一
    }

  }


  public static int find_max(int[] a) {
    int max = a[0];                                            // 求所有的槽位中小球最多的数量为 max
    for(int i=1;i<a.length;i++){
      if(max<a[i]) max=a[i];
    }

    return max;
  }


  public static void output(int[] a,int max) {
    System.out.println();

    for (int i = max; i > 0; i--) {
      for (int j = 0; j < a.length; j++) {
        if(a[j] >= i) System.out.print(0);
        else System.out.print(" ");
      }
      System.out.println();
    }

  }

}
