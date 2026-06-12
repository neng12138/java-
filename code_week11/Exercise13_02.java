package code_week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Exercise13_02 {
  public static void main(String[] args) {
    System.out.println();

    Double[] mon = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
    ArrayList<Number> arrayList = new ArrayList<>(Arrays.asList(mon));       //  Arrays.asList() =>  将 数 组 转 为 列 表

    System.out.println("Before the shuffle: ");
    output(arrayList);

    System.out.println("After the shuffle: ");
    shuffle(arrayList);
//    Collections.shuffle(arrayList);
    output(arrayList);

  }


  public static void shuffle(ArrayList<Number> arrayList){               //  将 列 表 打 乱
    Random random = new Random();

    for (int i = 0; i < arrayList.size(); i++) {
      int number = random.nextInt(arrayList.size());

      if(i == number) continue;
      else{
        Number mon = arrayList.get(number);
        arrayList.set(number,arrayList.get(i));                        //  交换列表中的两个元素（ set(int index,type element) ）
        arrayList.set(i,mon);
      }
    }

  }


  public static void output(ArrayList<Number> arrayList){
    for (int i = 0; i < arrayList.size(); i++) {
      System.out.print(arrayList.get(i)+"\t\t");
    }

    System.out.println();
  }

}
