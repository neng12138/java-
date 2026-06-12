package java_code.danyuan13;

public class TestEdible {
  public static void main(String[] args) {
    System.out.println();

    Object[] objects = {new Tiger(),new Chicken(),new Apple()};

    for (int i = 0; i < objects.length; i++) {
      if (objects[i] instanceof Edible){
        System.out.println( ((Edible)objects[i]).howToEat() );             //  调用重写方法会先查看 实际类型 再往上看其父类 （多态）
      }

      if(objects[i]  instanceof  Animal){
        System.out.println( ((Animal)objects[i]).sound() );               //   调用重写方法会先查看 实际类型 再往上看其父类 （多态）
      }
    }

  }
}


abstract class Animal{                                        //   抽 象 类

  //  Return animal sound
  public abstract String sound();                            //   抽 象 方 法  （  强 迫 子 类 重 写  ）

}


class Chicken extends Animal implements Edible{
  @Override
  public String howToEat(){
    return "Chicken: Fry is";
  }                  //  重 写 抽 象 方 法

  @Override
  public String sound(){
    return "Chicken: cock-a-doodle-doo";
  }
}


class Tiger extends Animal{
  public String sound(){
    return "Tiger: RROOAARR";
  }
}


abstract class Fruit implements Edible{                       //    不 包 含 抽 象 方 法 的 抽 象 类  （ 由 其 子 类 重 写 抽 象 方 法 ）
}

class Apple extends Fruit{
  @Override
  public String howToEat(){
    return "Apple: Make apple cider";
  }                //  重 写 接 口 的 抽 象 方 法
}

class Orange extends Fruit{
  @Override
  public String howToEat(){
    return "Orange: Make orange juice";
  }
}

