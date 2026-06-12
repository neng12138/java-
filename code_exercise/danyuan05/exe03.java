package java_code.danyuan05;

import java.util.Scanner;

public class exe03 {
  public static void main(String[] args) {                  // 显示素数
    System.out.println();

    Scanner input = new Scanner(System.in);
    System.out.print("输入找多少以内的素数： ");
    int num = input.nextInt();

    System.out.println();


    for(int i=2;i<=num;i++){
      int sum = 0;                                    // 判断某个数的因数有几个

      for(int j=1;j<=i;j++){
        if(i % j == 0) sum++;
      }

      if(sum == 2) System.out.print(i+"  ");
      if(i % 10 == 0) System.out.println();                 // 每找十个数换一行
    }

  }
}
