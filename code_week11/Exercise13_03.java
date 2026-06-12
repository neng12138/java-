package code_week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise13_03 {
  public static void main(String[] args) {
    System.out.println();

    Integer[] mon = {10,2,9,6,4,15,7,8,3,9};
    ArrayList<Number> arrayList = new ArrayList<>(Arrays.asList(mon));                   //  Arrays.asList() 将数组转为列表

    System.out.println("Before sort: ");
    output(arrayList);

    System.out.println("After sort: ");
    sort(arrayList);
    output(arrayList);

  }


  public static void sort(ArrayList<Number> arrayList){

    Number[] numbers = new Number[arrayList.size()];
    arrayList.toArray(numbers);                                        //   .toArray()  =>  将 列 表 转 为 数 组


    Arrays.sort(numbers);                                            //  列表中的数据要是既有数字也有字符串时，列表就不能用简单的方法进行排序
//    Arrays.sort(numbers, Collections.reverseOrder());

    for (int i = 0; i < arrayList.size(); i++) {
      arrayList.set(i,numbers[i]);
    }

  }

  public static void output(ArrayList<Number> arrayList){
    for (int i = 0; i < arrayList.size(); i++) {
      System.out.print(arrayList.get(i)+"\t\t");
    }
    System.out.println();
  }

}
