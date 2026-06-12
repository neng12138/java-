package java_code.danyuan12;

public class ChainedExceptionDemo {
  public static void main(String[] args) {
    System.out.println();

    try {
      method1();
    }
    catch (Exception ex){
      ex.printStackTrace();                                 //  首先显示从method1抛出的新异常，然后显示从method2抛出的原始异常
    }

  }


  public static void method1() throws Exception{
    try{
      method2();
    }
    catch (Exception ex){
      throw new Exception("New info from method1",ex);                    //  捕 获 异 常 并 包 装 成 一 个 新 的 异 常

//      throw new Exception("New info from method1");                    //   只会显示method1的新异常
    }
  }

  public static void method2() throws Exception{
    throw  new Exception("New info from method2");                      //   直接抛出异常
  }

}

//              异常处理方法：

//                          1.  直接 throw new Exception() ,  方法前也要 throw  Exception

//                          2.  catch捕获异常，并处理异常 （ catch后续的代码仍可以运行 ）
