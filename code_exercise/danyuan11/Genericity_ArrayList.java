package java_code.danyuan11;

import java.util.ArrayList;
import java.util.Arrays;

public class Genericity_ArrayList {
  public static void main(String[] args){
    System.out.println();

    Object[] o = {new Teacher01(),new Graduate01()};
    ArrayList list = new ArrayList(Arrays.asList(o));            //    等价于   ArrayList<Object>  list  =  new  ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i).toString());               //   列表里的元素大概机理  ： Object o = new Teacher01()
    }


    System.out.println();


    ArrayList<Person01> mylist =new ArrayList(Arrays.asList(o));

    for (int i = 0; i < mylist.size(); i++) {
      System.out.println(mylist.get(i).ToString());             //   列表里的元素大概机理  ： Person01 o = new Teacher01()

      if(mylist.get(i) instanceof Student01){
        System.out.println(((Student01) mylist.get(i)).tostring());             //  强制转换记号 ‘(类名)’  =>   更 改 声 明 类 型
      }

    }

  }
}


class Person01 {
  public String toString(){
    return "Person";
  }
  public String ToString(){
    return "person";
  }
}


class Teacher01 extends Person01{
  public String toString(){
    return "Teacher";
  }
  public String ToString(){
    return "teacher";
  }
}

class Student01 extends Person01{
  public String toString(){
    return "Student";
  }
  public String ToString(){
    return "student";
  }
  public String tostring(){
    return "Im student";
  }
}

class Graduate01 extends Student01{
  public String toString(){
    return "Graduate";
  }
  public String ToString(){
    return "graduate";
  }
  public String tostring(){
    return "Im graduate";
  }
}


//                            1.  类 名  --  必 须 开 头 大 写

//                        2. ArrayList  --  泛 型 类 型 （ 不泛型默认为 Object类型 ）

