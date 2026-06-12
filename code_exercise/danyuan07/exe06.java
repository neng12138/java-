package java_code.danyuan07;

import java.util.Arrays;

public class exe06 {
  public static void main(String[] args) {
    System.out.println();

    int[] mon ={4,2,7,3,5,9,7,11,1,6};

//    Arrays.sort(mon);                              //  Arrays.sort() => 升序排列
//    output(mon);

//    int x1 = 0, x2 = 3;
//    Arrays.sort(mon,x1,x2);                         //  Arrays.sort(mon, x1 , x2)  => 部分升序排序 mon[x1]——mon[x2-1]
//    output(mon);

//    int find = Arrays.binarySearch(mon,9);          // Arrays.binarySearch(mon,key) => 在数组mon中查询是否有key，有则返回其下标
//    System.out.println(find);

//    int find = Arrays.binarySearch(mon,8);       // Arrays.binarySearch(mon,key) => 在数组mon（排好序）中查询是否有key，无则返回它应该在的位置加上一个负号‘-’
//    System.out.println(find);

//    int e = 100;
//    Arrays.fill(mon,e);                      //  Arrays.fill(mon, e) => 将数组mon中的所有的元素都赋值为e
//    output(mon);

    int e = 100,x1 = 1,x2 = 5;
    Arrays.fill(mon,x1,x2,e);         //   //  Arrays.fill(mon, x1 , x2 , e)  => 部分赋值 mon[x1]——mon[x2-1]
    output(mon);

  }

  public static void output(int... mon) {
    System.out.println();

    for(int e:mon) System.out.print(e+"  ");
  }



  //                                  Arrays:  (import java.util.Arrays)

  //                                        1.Arrays.sort() =>  升序排序

  //                                        2.Arrays.binarySearch()  => 在数组中查询值

  //                                        3.Arrays.fill() => 给数组全部赋值

}
