package java_code.danyuan12;

import java.util.Scanner;

public class QuotientWithMethod_two {
  public static int quotient(int number1,int number2) throws ArithmeticException{
    if(number2 == 0)
      throw new ArithmeticException("Divisor cannot be zero");        //   抛出一个 ArithmeticException异常（ 数学运算异常 ）

    return number1/number2;
  }

  public static void main(String[] args) {
    System.out.println();
    Scanner input = new Scanner(System.in);

    System.out.print("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();

    try{
      int result = quotient(number1,number2);
      System.out.println(number1+" / "+number2+" is "+result);
    }
    catch (ArithmeticException ex){                                              //  catch（抓取） 异常
      System.out.println("Exception: an integer cannot be divided by zero");

//      System.out.println(ex.getMessage());                          //  获得异常抛出的值   (  默认为 null  )
//      System.out.println(ex.toString());
//      ex.printStackTrace();
    }

    System.out.println("Execution continues ...");      // catch异常后，代码仍可执行
  }
}




//                   ArithmeticException     ：    方法进行除法时当不整除，出现无限循环小数时，就会抛异常的