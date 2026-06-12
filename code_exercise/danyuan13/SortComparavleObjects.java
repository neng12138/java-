package java_code.danyuan13;

import java.math.BigInteger;
import java.util.Arrays;

public class SortComparavleObjects {
  public static void main(String[] args) {
    System.out.println();

    String[] cities = {"Savann","Boston","Atlanta","Tampa"};
    Arrays.sort(cities);

    for (String city : cities){
      System.out.print(city+"  ");
    }

    System.out.println();

    BigInteger[] hugeNumbers = {new BigInteger("23232323232310"),new BigInteger("432232323239292"),new BigInteger("54623239292")};
    Arrays.sort(hugeNumbers);

    for (BigInteger number : hugeNumbers){
      System.out.print(number+"  ");
    }

  }
}



//             Arrays.sort()  =>   需要数组中的元素实现 Comparable< E > 接口

//            Arrays.sort( array1 , Collections.reverseOrder() )    =>    降 序



/*
              package java.lang;


              public interface Comparable< E > {             //  所以说我们重写此接口方法就可以修改排序的方式 （  比如 ：降序  ）

                public  abstract int  compareTo( E o );
         }

 */
