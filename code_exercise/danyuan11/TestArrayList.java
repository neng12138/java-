package java_code.danyuan11;

import java.util.ArrayList;

public class TestArrayList {
  public static void main(String[] args) {
    System.out.println();

    ArrayList<String> cityList = new ArrayList<>();                 // 数 组 列 表 ( ArrayList要泛型的 )


    // Add some cities in the list
    cityList.add("London");
    // cityList now contains [London]
    cityList.add("Denver");
    // cityList now contains [London, Denver]
    cityList.add("Paris");
    // cityList now contains [London, Denver, Paris]
    cityList.add("Miami");
    // cityList now contains [London, Denver, Paris, Miami]
    cityList.add("Seoul");
    // Contains [London, Denver, Paris, Miami, Seoul]
    cityList.add("Tokyo");
   // Contains [London, Denver, Paris, Miami, Seoul ,Tokyo]


    System.out.println("List size? " + cityList.size());


    System.out.println("Is Miami in the list? " + cityList.contains("Miami"));


    System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));


    System.out.println("Is the list empty? " +cityList.isEmpty()); // Print false


    // Insert a new city at index 2
    cityList.add(2, "Xian");
    // Contains [London, Denver, Xian, Paris, Miami, Seoulf ，Tokyo]


    // Remove a city from the list
    cityList.remove("Miami");
    // Contains [London, Denver, Xian, Paris, Seoulf ，Tokyo]


    // Remove a city at index 1
    cityList.remove(1);
    // Contains [London, Xian, Paris, Seoul, Tokyo]


    // Display the contents in the list
    System.out.println(cityList.toString());           //   等价于 System.out.println(citylist);   （  即省略toString()  ）


    // Display the contents in the list in reverse order
    for (int i = 0; i < cityList.size(); i++) {
      System.out.print(cityList.get(i)+"  ");
    }


  }
}


//      List list = new ArrayList()    ==    ArrayList list = new ArrayList()

//     .set(int index, type element)         =>     直 接 修 改 列 表 中 某 下 标 的 数 值  （ 这 里 没 有 示 例 ）
