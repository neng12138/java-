package code_week07;

import java.util.Scanner;

public class Exercise10_07 {                        //  模拟ATM机
  public static void main(String[] args) throws InterruptedException{
    System.out.println();

    Account[] circle = new Account[10];
    dingyi(circle);

    while(true) {
      int id = find_true_id();

      boolean flag = true;

      while (flag) {

        int choice_num = Account.menu();

        switch (choice_num) {
          case 1:
            circle[id].check_balance();
            break;
          case 2:
            circle[id].withdraw();
            break;
          case 3:
            circle[id].deposit();
            break;
          case 4:
            flag = false;                        //  退出（exit）
            break;
            default:
              System.out.println("Your choice is Error! Please enter again .");
        }
        System.out.println('\n');
        Thread.sleep(1000);
      }

    }


  }

  public static void dingyi(Account[] circle){       // 定义数组对象
    for (int i = 0; i < circle.length; i++) {
      String true_id = ""+i;
      circle[i] = new Account(true_id);
    }
  }

  public static int find_true_id() {             //  循环输入id
    int id = Account.find_id();
    if (id < 0 || id > 9) {
      while (true) {
        int e = Account.find_id();
        if (e >= 0 && e <= 9) {
          id = e;
          break;
        }
      }
    }
    return id;
  }

}


class Account{
  private String id;
  private double check = 100;

  Account(){
  }

  Account(String id){
    this.id = id;
  }

  static int find_id(){                         //  输入id
    System.out.printf("Enter an id:");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();

    System.out.println();
    return num;
  }

  static int menu(){                    //  菜单
    System.out.printf("Main menu %n1: check balance %n2: withdraw %n3: deposit %n4: exit%n");
    System.out.printf("Enter a choice:");
    Scanner input = new Scanner(System.in);
    int choice = input.nextInt();

    return choice;
  }

  void check_balance(){               //   查询开支
    System.out.printf("The balance is: %.1f",this.check);
  }

  void withdraw(){                   // 取钱
    System.out.printf("Enter an amount to withdraw:");
    Scanner input = new Scanner(System.in);
    double money = input.nextDouble();
    this.check -= money;

  }

  void deposit(){                    //  存钱
    System.out.printf("Enter an amount to deposit:");
    Scanner input = new Scanner(System.in);
    double money = input.nextDouble();
    this.check += money;

  }

}
