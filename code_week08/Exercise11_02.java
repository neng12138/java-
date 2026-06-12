package code_week08;


import java.util.Date;

public class Exercise11_02 {
  public static void main(String[] args) {
    System.out.println();


    Person person = new Person("Jhon","广州星河大道1号","123456","123@qqcom");
    output(person);


    person = new Student(2,"Make","广州星河大道2号","234567","234@qq.com");
    output(person);


    person = new Employee(201,12000,"Hao Ming","广州星河大道3号","345678","345@qq.com");
    output(person);


    person  = new Faculty(100,"正部级",301,14000,"Jump","广州星河大道4号","456789","456@qq.com");
    output(person);


    person = new Staff("教授",501,15000,"Sing","广州星河大道5号","12581","456@qq.com");
    output(person);


  }


  public static void output(Person p){
    System.out.println(p.toString()+'\n');
  }

}



class Person{
  private String name;
  private String address;
  private String phone_number;
  private String email_address;

  Person(){}

  Person(String name,String address,String phone_number,String email_address){
    this.name = name;
    this.address = address;
    this.phone_number = phone_number;
    this.email_address = email_address;
  }


  String getName(){return name;}
  String getAddress(){return address;}
  String getPhone_number(){return phone_number;}
  String getEmail_address(){return email_address;}

  void setName(String name){ this.name = name; }
  void setAddress(String address){ this.address = address;}
  void setPhone_number(String phone_number){ this.phone_number = phone_number;}
  void setEmail_address(String email_address){ this.email_address = email_address;}


   public String toString(){
    return "The name is "+name+"\nThe address is "+address+"\nThe phone_number is "+phone_number+"\nThe email_address is "+email_address+'\n';
  }

}



class Student extends Person{
  private int greed;

  Student(){}

  Student(int greed){ this.greed = greed;}

  Student(int greed,String name,String address,String phone_number,String email_address){
    super(name, address, phone_number, email_address);
    this.greed = greed;
  }


  int getGreed(){ return greed;}
  void setGreed(int greed){ this.greed = greed;}


  public String toString(){
    return super.toString()+"The student greed is "+greed+'\n';
  }

}



class Employee extends Person{
  private int office;
  private int salary;
  private java.util.Date appointment_date;


  Employee(){
    appointment_date = new Date();
  }

  Employee(int office,int salary){
    this.office = office;
    this.salary = salary;
    appointment_date = new Date();
  }

  Employee(int office,int salary,String name,String address,String phone_number,String email_address){
    super(name, address, phone_number, email_address);
    this.office = office;
    this.salary = salary;
    appointment_date = new Date();
  }


  int getOffice(){ return office;}
  int getSalary(){ return salary;}

  void setOffice(int office){ this.office = office;}
  void setSalary(int salary){ this.salary = salary;}


  String getAppointment_date(){
    return appointment_date.toLocaleString();
  }


  public String toString(){
    return super.toString()+"The employee office is "+office+"\nThe employee salary is "+salary+"\nThe employee appointment_date is "+getAppointment_date()+'\n';
  }

}


class Faculty extends Employee{
  private int work_time;
  private String rank;

  Faculty(){}

  Faculty(int work_time,String rank){
    this.work_time = work_time;
    this.rank = rank;
  }

  Faculty(int work_time,String rank,int office,int salary,String name,String address,String phone_number,String email_address){
    super(office, salary, name, address, phone_number, email_address);
    this.work_time = work_time;
    this.rank = rank;
  }


  int getWork_time(){return work_time;}
  String getRank(){return rank;}
  void setWork_time(int work_time){ this.work_time = work_time;}
  void setRank(String rank){ this.rank = rank;}


  public String toString(){
    return super.toString()+"The Faculty work_time is "+work_time+"h\nThe Faculty rank is "+rank+'\n';
  }
}


class Staff extends Employee{
  private String job_title;

  Staff(){}

  Staff(String job_title){
    this.job_title = job_title;
  }

  Staff(String job_title,int office,int salary,String name,String address,String phone_number,String email_address){
    super(office, salary, name, address, phone_number, email_address);
    this.job_title = job_title;
  }


  String getJob_title(){ return job_title;}
  void setJob_title(String job_title){ this.job_title = job_title;}


  public String toString(){
    return super.toString()+"The Staff job_title is "+job_title+'\n';
  }
}