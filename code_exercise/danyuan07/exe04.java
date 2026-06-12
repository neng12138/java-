package java_code.danyuan07;

import java.util.Scanner;

public class exe04 {
  public static void main(String[] args) {
    System.out.println();

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the n is: ");
    int n = input.nextInt();
    int[] mylist = new int[n];

//    shur(mylist);                                               //  调用输入值初始化数组
    shur_ran(mylist);                                             //  调用随机数初始化数组
    output(mylist);

    System.out.println();
    sum(mylist);                                                  //  调用数组中数据的求和

    find_max(mylist);                                             //  调用找数组的最大值

    find_min(mylist);                                             //  调用找数组的最小值

    System.out.println();
    left_move(mylist,2);                                //  调用左移动数组的元素
    output(mylist);

    System.out.println();
    right_move(mylist,2);                               //  调用右移动数组的元素
    output(mylist);

    System.out.println();
    disorganize(mylist);                                          //  调用打乱数组的元素
    output(mylist);

  }

  public static void shur(int[] mon) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter "+ mon.length + " values: ");        //  使用输入值初始化数组
    for (int i = 0; i < mon.length; i++) {
      mon[i] = input.nextInt();
    }

  }


  public static void shur_ran(int[] mon) {

    for (int i = 0; i < mon.length; i++) {                           //  使用随机数初始化数组
      int ran = (int)(Math.random()*11);
      mon[i] = ran;
    }

  }


  public static void output(int[] mon) {

//    for (int i = 0; i < mon.length; i++) {                   //  打印输出数组
//      System.out.print(mon[i]+ "  ");
//    }
    for (int e:mon) {
      System.out.print(e+ "  ");
    }
    System.out.println();

  }


  public static void sum(int[] mon) {                          //  对所有元素求和

    int summary = 0;
    for (int e:mon) {
      summary += e;
    }
    System.out.println("The sum is: " + summary);

  }


  public static void find_max(int[] mon) {                   // 找出数组的最大值

    int max = mon[0];
    for (int e:mon) {
      if(max < e)  max = e;
    }
    System.out.println("The max is: " + max);

  }

  public static void find_min(int[] mon) {                    // 找出数组的最小值

    int mix = mon[0];
    for (int e:mon) {
      if(mix > e)  mix = e;
    }
    System.out.println("The mix is: " + mix);

  }


  public static void disorganize(int[] mon) {                  // 随机打乱数组中的数据

    for (int i = 0; i < mon.length; i++) {
      int ran = (int)(Math.random()*mon.length);
      int flag = mon[ran];                               // 交换
      mon[ran] = mon[i];
      mon[i] = flag;
    }

  }


  public static void left_move(int[] mon,int move_num) {          //  向左移动数组的元素

    for (int i = 0; i < move_num; i++) {
      int temp = mon[0];
      for (int j = 1; j < mon.length; j++) {
        mon[j-1] = mon[j];
      }
      mon[mon.length-1] = temp;
    }

  }


  public static void right_move(int[] mon,int move_num) {          //  向右移动数组的元素

    for (int i = 0; i < move_num; i++) {
      int temp = mon[mon.length-1];
      for (int j = mon.length-2; j >=0; j--) {
        mon[j+1] = mon[j];
      }
      mon[0] = temp;
    }

  }




  //                                    for( int e: mon) System.out.println(e);

  //                         等价于:   for(int i=0;i<mon.length;i++){   int e = mon[i];   System.out.println(e);     }




}
