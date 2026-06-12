package code_week11;

import java.util.Arrays;
import java.util.Collections;

public class Exercise08_04 {
  public static void main(String[] args) {                             //  用java类和接口重写Exercise 08_04
    System.out.println();

    cut();

  }


  public static int[] sum(){                                             //   返回一个记录各员工的总工作时间的数组
    int[][] work = {
      {2,4,3,4,5,8,8},{7,3,4,3,3,4,4},{3,3,4,3,3,2,2},{9,3,4,7,3,4,1},
      {3,5,4,3,6,3,8},{3,4,4,6,3,4,4},{3,7,4,8,3,8,4},{6,3,5,9,2,7,9}
    };

    int[] work_time = new int[work.length];
    for (int i = 0; i < work.length; i++) {
      int sum = 0;
      for (int j = 0; j < work[i].length; j++) {
        sum += work[i][j];
      }
      work_time[i] = sum;
    }

    return work_time;
  }


  public static void output(employee[] e){                              //   输出employee类型的数组中的元素
    for (int i = 0; i < e.length; i++) {
      System.out.println(e[i].toString());
    }

//    for (employee x : e) System.out.println(x.toString());

  }


  public static void cut(){                                           //       主  函  数
    int[] work = sum();

    employee[] employees = new employee[work.length];
    for (int i = 0; i < employees.length; i++) {
      employees[i] = new employee(i,work[i]);                         //    实例化
    }

    Arrays.sort(employees, Collections.reverseOrder());              //    降 序 排 序

    output(employees);
  }

}



class employee implements Comparable<employee>{                   //  定义employee类来记录各员工的编号和总工作时间
  private int employee_number;
  private int work_time;

  employee(){}

  employee(int employee_number,int work_time){
    this.employee_number = employee_number;
    this.work_time = work_time;
  }

  int getEmployee_number(){return employee_number;}
  int getWork_time(){return work_time;}

  public String toString(){
    return "Employee"+employee_number+"\t\t"+work_time;
  }

  public int compareTo(employee e){                              //  重写Comparable<>接口的compareTo的方法，实现Arrays.sort()方法
    if (this.work_time > e.getWork_time()) return 1;
    else if(this.work_time < e.getWork_time()) return -1;
    else return 0;
  }

}
