package java_code.danyuan17;

import java.io.*;
import java.util.ArrayList;


public class TestObjectStream {

  public static void main(String[] args) throws ClassNotFoundException, IOException {
    System.out.println();

    Integer[] numbers = {1, 2, 3, 4, 5};
    String[] strings = {"John", "Jim", "Jake"};
    MyClass2 myClass = new MyClass2();
    myClass.name = "welcome";
    myClass.i = 8;
    MyClass2.staticVar = 10;
    myClass.setAddress("广州");
    ArrayList list = new ArrayList();
    list.add(numbers);
    list.add(strings);
    list.add(myClass);


    // Create an output stream for file array.dat
    ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(TestObjectStream.class.getResource("").getPath()+"array.dat"));

    // Write arrays to the object output stream（序列化）
    output.writeObject(list);

    // Close the stream
    output.close();


    // Create an input stream for file array.dat
    ObjectInputStream input = new ObjectInputStream(new FileInputStream(TestObjectStream.class.getResource("").getPath()+"array.dat"));

    // 反 序 列 化 （强制类型转换）
    ArrayList newList = (ArrayList) input.readObject();

    Integer[] newNumbers = (Integer[]) newList.get(0);
    System.out.println("反序列化整型数组 Integer[]: ");
    for (int i : newNumbers) {
      System.out.println(i);
    }

    String[] newStrings = (String[]) newList.get(1);
    System.out.println("反序列化字符串数组 String[]: ");
    for (String s : newStrings) {
      System.out.println(s);
    }

    MyClass2 newMyClass = (MyClass2) newList.get(2);
    System.out.println("反序列化 MyClass 中的变量name: " + newMyClass.name);
    System.out.println("反序列化 MyClass 中的变量 i: " + newMyClass.i);

    /*
    测试这个静态变量，需要把前面赋值及写的操作注释掉，只保留读文件的代码，否则由于jvm已经将静态变量
    加载，所以获取的是加载的这个变量值，而不是真正的静态变量值（应该为0）
    */
    System.out.println("反序列化 MyClass 中的静态变量 staticVar(静态变量无法序列化）: " +MyClass2.staticVar);
    System.out.println("反序列化 MyClass 中的a()方法：");
    newMyClass.a();

    input.close();
  }

}


class MyClass2 implements Serializable {
  String name;
  int i;
  private String address = "beijin";
  static int staticVar;

  public void setAddress(String address){
    this.address = address;
  }

  public String getAddress(){
    return address;
  }

  public void a() {
    System.out.println("present_temp " + getAddress());
  }

}

//      若看读写方法看 code_week12



//           ObjectOutputStream  =>  1. 类要有Serializable接口才可以被虚拟机标记，进行序列化和反序列化操作 ，否则会报错
//                                (  所 有 基 本 类 型 、 针 对 基 本 类 型 值 的 包 装 类 都 可 序 列 化  )


//                                   2. 关键字transient ： 告诉Java虚拟机将对象输出流时忽略这些有此关键字的数据域


//                                   3. 使用ObjectInputStream读取数据，不能使用available()!=0 或 read()!=-1
//                                (  这 个 时 候 可 以 使 用  try … catch(EOFException e)  )




