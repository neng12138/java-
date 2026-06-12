package java_code.danyuan12;

public class TestException {
  public static void main(String[] args) {
    System.out.println();

    try{
      System.out.println( sum(new int[]{1,2,3,4,5}) );
    }
    catch (Exception ex){                                                     //  抓取 Exception异常
      ex.printStackTrace();
      System.out.println("\n"+ex.getMessage());
      System.out.println("\n"+ex.toString());

      System.out.println("\nTrace Info Obtained from getStackTrace");

      StackTraceElement[] traceElements = ex.getStackTrace();
      for (int i = 0; i < traceElements.length; i++) {
        System.out.print("method "+traceElements[i].getMethodName());
        System.out.print("("+traceElements[i].getClassName()+":");
        System.out.println(traceElements[i].getLineNumber()+")");

//        System.out.println(traceElements[i].getMethodName());
//        System.out.println(traceElements[i].getClassName());
//        System.out.println(traceElements[i].getLineNumber());
//        System.out.println(traceElements[i].getFileName());
      }
    }

  }

  public static int sum(int[] list){
    int result = 0;
    for (int i = 0; i <= list.length ; i++) result += list[i];                //  循环中迭代步数应该用"<"，因此此处会抛出异常

    return result;
  }

}





//                           Exception   :   一 个 最 常 用 的 必 检 异 常 类 （  异常的默认父类，可以抓取到所有的异常  ）