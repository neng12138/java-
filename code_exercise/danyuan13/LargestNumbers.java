package java_code.danyuan13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumbers {
  public static void main(String[] args) {
    System.out.println();

    ArrayList<Number> list = new ArrayList<>();                        //   Number 本身就是一个抽象类

    list.add(45);
    list.add(3445.53);
    list.add(new BigInteger("31415926535131412581"));
    list.add(new BigDecimal("2.09090900909090909090909"));

    System.out.println("The largest number is "+getLargestNumber(list));
  }


  public static Number getLargestNumber(ArrayList<Number> number) {
    if(number == null || number.size()==0){
      return null;
    }

    Number numbers = number.get(0);
    for (int i = 1; i < number.size(); i++) {
      if(number.get(i).doubleValue() < numbers.doubleValue()){
        numbers = number.get(i);
      }
    }

    return numbers;

  }
}




//                          抽象类 Number 的抽象方法 ：

//                                             =>     +   intValue()  :    int

//                                             =>     +  doubleValue()   :    double

//                                             =>     +  floatValue()   :    float

//                                             =>     +  longValue()   :    long


//           Number 的默认子类 ：  Integer , Double , Float , Character , Long , Short , Byte , BigInteger , BigDecimal

//                        （   BigInteger : 记录很大的整数值     BigDecimal ： 记录很大的浮点数值   ）