package java_code.danyuan09;

import java.util.Random;

public class exe05 {
  public static void main(String[] args) {
    System.out.println();

    Random random = new Random();                               //  实例化

    //  该方法默认生成的整数范围是int类型的取值范围
    int randomNumber1 = random.nextInt();


    //  生成指定范围内的随机整数，可以使用nextInt(int bound)方法。该方法会生成一个从0到bound-1之间的随机整数
    int min1 = 1;
    int max1 = 10;
    int randomNumber2 = random.nextInt(max1 - min1 + 1) + min1;



    //   生成一个0.0到1.0之间的随机浮点数
    double randomNumber3 = random.nextDouble();



    //   生成一个随机布尔值
    boolean randomBoolean4 = random.nextBoolean();




    //  高级用法 : 生成一个小写字母a到z之间的随机字符
    int randomNumber5 = random.nextInt(26); // 生成0到25之间的随机整数
    char randomChar = (char) ('a' + randomNumber5); // 将随机整数转换为对应的字符




    //  高级用法 : 随机密码通常需要包含字母、数字和特殊字符。我们可以结合Random类和字符串操作来生成随机密码

    //           生成一个包含小写字母、大写字母、数字和特殊字符的随机密码，长度为10个字符
    String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";

    int length = 10; // 密码长度为10
    StringBuilder password = new StringBuilder();

    for (int i = 0; i < length; i++) {
      int index = random.nextInt(characters.length());
      password.append(characters.charAt(index));
    }


  }
}





//                            Random类  ：  生 成 随 机 数   (字 母，数 组，字 符)         （  import  java.util.Random;  ）


//                                 =>  1. Random  对象名  =  new  Random（）;             //  定义一个Random类的对象


//                                 =>  2.  Random类的方法 :     整数    =>    对象名 . nextInt()

//                                                            浮点数   =>    对象名 . nextDouble()

//                                                            布尔值   =>    对象名 . nextBoolean()



//                               整数  :  对象名 .  nextInt（int bound）;          => 返回一个[0 , bound-1]的随机整数

//                             浮点数  ：  对象名 . nextDouble（）;                => 返回一个[0.0 , 1.0）的随机浮点数

//                            布尔值 ：  对象名 。 nextBoolean（）;                => 以50%的概率返回true或false




