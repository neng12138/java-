package java_code.danyuan07;

public class exe03 {
  public static void main(String[] args) {      // 读取100个数，计算他们的平均值，然后找出有多少个数大于平均值
    System.out.println();

    int[] mon = new int[100];

    int sum = 0;
    for (int i = 0; i <100 ; i++) {
      int ran = (int)(Math.random()*101);
      mon[i] = ran;
      sum += ran;
    }

    int mid = sum/100;

    int num = 0;
    for (int i = 0; i <100 ; i++) {
      if(mon[i]>mid) num++;
    }

    System.out.println("The num is: " + num);

  }
}
