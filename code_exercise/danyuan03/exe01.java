package java_code.danyuan03;

import java.util.Scanner;

public class exe01 {
  public static void main(String[] args){
    System.out.println();


    System.out.print("Enter the score: ");
    Scanner input = new Scanner(System.in);
    int score = input.nextInt();


    if(score <60)  System.out.println(" 不及格（D） ");
    else if(score <=70) System.out.println(" 及格（C） ");
    else if(score <=85) System.out.println(" 良好（B） ");
      else System.out.println(" 优秀（A） ");





    //                  循环：    1.   if( 条件 ）{     循环语句；   }

    //                           2.   if( 条件 ）{  语句1； }          else {   语句2； }

    //                           3.   if( 条件1 ){ 语句1；}      else if( 条件2 ）{语句2；}      else {语句3；}

    //                           4.    switch(变量）{   case 常量1：语句1；   case 常量2：语句2；    default：语句3；  }

    //                           5.    max = a>b? a : b ;

  }
}
