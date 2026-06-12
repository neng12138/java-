package code_week05;

import java.util.Scanner;

public class Exercise08_14 {
  public static void main(String[] args) {
    System.out.println();


    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size for the matrix:");
    int num = input.nextInt();                                                 //  输入一个二维数组（行数与列数一样）的 行数

    System.out.println();


    int[][] arrays = new int[num][num];                                       //  定义一个 二维数组arrays 存储数据


    int[][] mon = new int[num][2];                               //  定义一个 二维数组mon 每行存储 arrays这行‘1’的个数和arrays这列‘1’的个数
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < 2; j++) {
        mon[i][j] = 0;
      }
    }


    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        int ran = (int)(Math.random()*2);                                    //   随机产生一个 0 或 1
        arrays[i][j] = ran;                                                  //   将 随机数ran 存储在二维数组arrays中
        System.out.print(arrays[i][j]);                                      //   输出二维数组arrays的数据
      }

      System.out.println();                                       //  每输出一行就换一次行

    }


    int master=0,true_master=0;                                  //  master表示副对角线中‘1’的个数  true_master表示主对角线中‘1’的个数
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {

        if(arrays[i][j] == 1) mon[i][0] += 1;                   //  如果arrays数组每行有‘1’ ， 对应的那行就加1

        if(arrays[j][i] == 1) mon[i][1] += 1;                   //  如果arrays数组每列有‘1’ ， 对应的那列就加1

        if(i == j && arrays[i][j] == 1) true_master += 1;             //   如果arrays数组的主对角线有‘1’ ， true_master就加1

        if(i+j == (num-1) && arrays[i][j] == 1) master +=1;           //  如果arrays数组的副对角线有‘1’  ， master就加1

      }
    }

    System.out.println();

    int flag_hang = 0;                                               //   判断每行是否有全为0或1的情况
    for (int i = 0; i < num; i++) {
      if(mon[i][0] == 0) {System.out.println("All 0s on row "+(i+1));  flag_hang = 1;}
      if(mon[i][0] == num) {System.out.println("All 1s on row "+(i+1));  flag_hang = 1;}
    }
    if(flag_hang == 0) System.out.println("No same numbers on a row");


    int flag_lie = 0;                                                //  判断每列是否有全为0或1的情况
    for (int i = 0; i < num; i++) {
      if(mon[i][1] == 0) {System.out.println("All 0s on column "+(i+1));  flag_lie = 1;}
      if(mon[i][1] == num) {System.out.println("All 1s on column "+(i+1));  flag_lie = 1;}
    }
    if(flag_lie == 0) System.out.println("No same numbers on a column");


    if(true_master == 0) System.out.println("All 0s on the major diagonal ");
    else if(true_master == num) System.out.println("All 1s on the major diagonal ");
    else System.out.println("No same numbers on the major diagonal");


    if(master == 0) System.out.println("All 0s on the sub-diagonal ");
    else if(master == num) System.out.println("All 1s on the sub-diagonal ");
    else System.out.println("No same numbers on the sub-diagonal");

  }
}
