package code_week06;

import java.util.Date;

public class Exercise09_07 {
  public static void main(String[] args) {
    System.out.println();

    Account mycircle = new Account(1122,20000);                    //  定义类的对象并初始化

    mycircle.alter_annualInterestRate(4.5);
    mycircle.withDraw(2500);
    mycircle.deposit(3000);

    mycircle.output();

    double month = mycircle.getMonthlyInterestRate();
    System.out.println("The monthly interest rate is: "+ month);

    mycircle.output_data();

  }
}


class Account{
  private int id = 0;
  private double balance = 0;
  private double annualInterestRate = 0;                                             // 存储当前利率
  private Date dateCreated = new Date();                                            //  存储账户的开户日期


  Account(){                                                                       // 无参构造方法
  }

  Account(int id_true,double balance_true){
    id = id_true;
    balance = balance_true;
  }


  void output(){
    System.out.println("The id is: "+id);
    System.out.println("The balance is: "+balance);
    System.out.println("The annualInterestRate is: "+annualInterestRate+"%");
  }


  void alter_id(int i){
    id = i;
  }

  void alter_balance(double b){
    balance = b;
  }

  void alter_annualInterestRate(double a){
    annualInterestRate = a;
  }


  void output_data(){
    System.out.println("The account datecreated is: "+ dateCreated.toLocaleString());
  }      //  输出Data时间


  double getMonthlyInterestRate(){                  // 返回月利率（于返回月利息，而不是利率）
    return balance*(annualInterestRate/1200);
  }

  void withDraw(double money){                                                              //  从账户提取特定数额
    if(balance > money) balance -= money;
    else System.out.println("The withDraw is Error!");
  }

  void deposit(double money){                     // 法向账户存储特定数额
     balance += money;
  }                                         //  向账户存入特定数额


}
