package code_week04;

public class Exercise07_23 {
  public static void main(String[] args) {
    System.out.println();

    boolean[] mon = new boolean[100];                                // 定义一个布尔值的数组表示每个柜子的开关状态（false表示关， true表示开）
                                                                     // boolean数组默认是 false


    for(int i=0;i<100;i++){
      int e = i, num = i;                                             // e表示每个学生开关柜子间隔的柜子数，num表示当前表示的柜子

      for(int j=i;j<100;j++){
        if(j == num) {mon[j] = !mon[j]; num = num+1+e;}                   // 如果是符合的柜子，就将柜子的状态取反（’！‘）
      }

    }


    for(int i=0;i<100;i++){
      if(mon[i]==true) System.out.print((i+1) + "   ");             // 遍历所有的柜子，如果柜子是打开的状态就输出柜子的号码
    }


  }
}
