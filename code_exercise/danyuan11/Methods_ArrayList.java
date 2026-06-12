package java_code.danyuan11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Methods_ArrayList {
  public static void main(String[] args) {
    System.out.println();

    Integer[] i = {5,6,3,12,1,7,4};
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(i));

    System.out.println(list);


    Collections.sort(list);                          //   Collections.sort()   =>   升 序 排 列
    System.out.println(list);


    System.out.println("The max is: "+Collections.max(list));            //   Collections.max()   =>   找 最 大 值
    System.out.println("The min is: "+Collections.min(list));            //   Collections.min()   =>   找 最 小 值


    Collections.shuffle(list);                      //   Collections.shuffle()   =>    随 机 打 乱
    System.out.println(list);
  }
}



//                               数组     =>      Arrays  （  import java.util.Arrays  ）


//                               列表     =>      Collections   （  import.util.Collections  ）


//            数组 -- 数组名[ index ]      列表 -- list.get( index )       String -- str.charAt( index )


//                           数组转列表  :     Arrays.asList( arrays )  =>   将数组arrays转为列表

//                          列表转数组  ：   list . toArray( arrays )   =>   将列表list转为数组，并赋给数组arrays  (  数组arrays要提前建好  )