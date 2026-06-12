package code_week06;

public class Exercise08_04 {
  public static void main(String[] args) {                               //  用java类的方法重新写Exerxise08_04
    System.out.println();


    int[][] work = {                                                    //  定义8位员工的工作时间表
      {2,4,3,4,5,8,8},{7,3,4,3,3,4,4},{3,3,4,3,3,2,2},{9,3,4,7,3,4,1},
      {3,5,4,3,6,3,8},{3,4,4,6,3,4,4},{3,7,4,8,3,8,4},{6,3,5,9,2,7,9}
    };


    yuangong[] circle = new yuangong[work.length];                      //  定义一个类的数组类型 存储每位员工的总时间和员工的编号
    for (int i = 0; i < work.length; i++) {
      int sum = 0;
      for (int j = 0; j < work[i].length; j++) {
        sum += work[i][j];
      }
      circle[i] = new yuangong(i,sum);                                 //  引用类的对象
    }



    int flag = 1,mon = circle.length-1;                               //  冒泡排序（降序）
    while(flag==1 && mon>0){
      flag = 0;

      for (int i = 0; i < mon; i++) {
        if(circle[i+1].work_hour > circle[i].work_hour) { swap(circle,i,i+1); flag = 1;}
      }
      mon--;
    }


    output(circle);                                                  //  输出类数组中我们要的数据

  }


  public static void output(yuangong[] circle) {
    for (int i = 0; i < circle.length; i++) {
      circle[i].output();
    }
  }


  public static void swap(yuangong[] a,int b,int c) {              //  交换
    int t = a[b].work_hour,e = a[b].work_num;

    a[b].work_hour = a[c].work_hour;
    a[c].work_hour = t;

    a[b].work_num = a[c].work_num;
    a[c].work_num = e;
  }


}


class yuangong{                                                  // 员工类


  int work_num = 0;                                             // 数据域
  int work_hour = 0;


  yuangong(){                                                   //  无参构造方法
  }


  yuangong(int num,int hour){                                   //  构造方法
    work_num = num;
    work_hour = hour;
  }


  void output(){                                                //  成员方法
    System.out.println("Employee"+work_num+"  "+work_hour);
  }

}
