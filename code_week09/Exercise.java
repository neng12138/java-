package code_week09;

public class Exercise {
  public static void main(String[] args) {
    System.out.println();

    Object o = new family(18,"Mike","me");
    System.out.println(o.toString());

    o = new male(8000,45,"Wen Chong","Father");
    System.out.println(o.toString());

    o = new female(168,42,"Liang Ying","Mother");
    System.out.println(o.toString());
  }
}


class family{
  private int age;
  private String name;
  private String title_name;

  family(){}

  family(int age,String name,String title_name){
    this.age = age;
    this.name = name;
    this.title_name = title_name;
  }

  int getAge(){ return age; }
  String getName(){ return name;}
  String getTitle_name(){ return title_name;}
  void setAge(int age){ this.age=age; }
  void setName(String name){ this.name = name;}
  void setTitle_name(String title_name){ this.title_name = title_name;}

  public String toString(){
    return "The family member name is "+name+"\nThe family member age is "+age+"\nThe family member title_name is "+title_name+'\n';
  }
}


class male extends family{
  private double salary;

  male(){}

  male(double salary){
    this.salary = salary;
  }

  male(double salary,int age,String name,String title_name){
    super(age, name,title_name);
    this.salary = salary;
  }

  double getSalary(){return salary;}
  void setSalary(double salary){this.salary = salary;}

  public String toString(){
    return super.toString()+"The family member sex is male\n"+"The family member salary is "+salary+"元"+'\n';
  }
}


class female extends family{
  private int height;

  female(){}

  female(int height){
    this.height = height;
  }

  female(int height,int age,String name,String title_name){
    super(age, name,title_name);
    this.height = height;
  }

  int getHeight(){return height;}
  void setHeight(int height){this.height = height;}

  public String toString(){
    return super.toString()+"The family member sex is female\n"+"The family member height is "+height+"cm"+'\n';
  }
}