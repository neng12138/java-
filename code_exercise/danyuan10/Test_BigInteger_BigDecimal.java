package java_code.danyuan10;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test_BigInteger_BigDecimal {
  public static void main(String[] args) {
    System.out.println();

    BigInteger x1 = new BigInteger("3");
    BigInteger y1 = new BigInteger("7");
    BigInteger z1 = x1.add(y1);                             //  add()   =>    相加
    BigInteger e = x1.multiply(y1);                        //  mutiply()  =>  相乘
    System.out.println("The x1 is: "+x1);
    System.out.println("The y1 is: "+y1);
    System.out.println("The z1 is: "+z1);
    System.out.println("The e is: "+e);


    System.out.println();


    BigDecimal x2 = new BigDecimal(1.0);
    BigDecimal y2 = new BigDecimal(3);
    BigDecimal z2 = x2.divide(y2,10,BigDecimal.ROUND_UP);
    System.out.println("The x2 is: "+x2);
    System.out.println("The y2 is: "+y2);
    System.out.println("The z2 is: "+z2);

  }
}
