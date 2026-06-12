package java_code.danyuan09;

public class exe10 {
  public static void main(String[] args) {
    System.out.println();

    Student circle = new Student(3166,2005,01,04);

    int id = circle.getId();
    Birthday birthday = circle.getBirthday();


    System.out.println("The id is: "+id);

    birthday.output();
  }
}




class Student{                                                  //  Student类 ： 存 储 学 生 的 基 本 信 息

  private int id;
  private Birthday birthday;                                 //  定义一个Birthday类的对象  （一 个 类 中 定 义 另 一 个 类）

//  Student(){
//  }

  Student(int id,int year,int month,int day){
    this.id = id;
    birthday = new Birthday(year,month,day);
  }

  int getId(){
    return id;
  }

  Birthday getBirthday(){
    return birthday;
  }

}




class Birthday{                                             //  Birthday类 ： 存 储 学 生 的 出 生 日 期

  private  int year;
  private  int month;
  private  int day;

  Birthday(){
  }

  Birthday(int year,int month,int day){
    this.year = year;
    this.month = month;
    this.day = day;
  }

  void output(){
    System.out.println("The year is: "+year);
    System.out.println("The month is: "+month);
    System.out.println("The day is: "+day);
  }
}





//                                       private :  数据只能在定义它的类中引用  （  保 护 数 据  ）