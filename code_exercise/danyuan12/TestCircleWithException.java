package java_code.danyuan12;

public class TestCircleWithException {
  public static void main(String[] args) {
    System.out.println();

    try{
      CircleWithException c1 = new CircleWithException(5);
      CircleWithException c2 = new CircleWithException(-5);                   //  抛出异常 ， try下面的程序不会再运行
      CircleWithException c3 = new CircleWithException(0);
    }
    catch (IllegalArgumentException ex){
      System.out.println(ex.toString());
    }


    System.out.println("Number of objects created: "+CircleWithException.getNumberOfObject());       //      1

  }
}

//         出现异常  --  1. try 后续代码不执行     2. catch 后续代码仍可执行
