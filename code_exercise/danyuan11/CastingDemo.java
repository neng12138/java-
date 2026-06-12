package java_code.danyuan11;

public class CastingDemo {
  public static void main(String[] args) {
    System.out.println();

    Family f1 = new Mum();
//    System.out.println(f1.toString());
    Family f2 = new Father();
//    System.out.println(f2.toString());

    displayFamily(f1);      // 多态
    displayFamily(f2);     // 多态

  }


  public static void displayFamily(Family f){

    if (f instanceof Mum){
      System.out.println(f.toString());
    }
    else if(f instanceof Father){
      System.out.println(f.toString());
    }
    else System.out.println(f.toString());
  }


  public static void output(Family f){
    System.out.println(f.toString());
  }

}



class Family /*extends Object */{                      //  java 所有类默认父类型为Object

  public String toString(){
    return "Family";
  }
}


class Mum extends Family{

  public String toString(){
    return "Mum";
  }
}


class Father extends Family{

  public String toString(){
    return "Father";
  }
}




//                                   instanceof  :  判断实例对象所拥有的类型   （  返回值为 true 或 false  ）

//                                 1.  对象名   instanceof   要判断的类名


//                                2. 找到后 ： ( （ 要判断的类名 ）对象名 )   等价于  把对象的声明类型改为 要判断的类名


//                               3.  ( （ 要判断的类名 ）对象名 ) . 重写方法()

//                           //  调 用 重 写 方 法 都 会 先 看 此 时 的 实 际 类 型 ，再 往 上 查 找 实 际 类 型 的 父 类


